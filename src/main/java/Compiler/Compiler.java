package Compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import BaseClasses.SimpleFortranLexer;
import BaseClasses.SimpleFortranParser;
import Converters.AntlrToProgram;
import ErrorHandling.SyntaxErrorListener;
import ErrorHandling.SemanticErrorsHandler;
import Converters.ExpressionProcessor;
import Model.Program;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("The number of arguments is not the expected. I expect you to give me just one argument:"
                    + "the input file path");
            return;
        }

//        float number = Float.parseFloat("123.456E-3");
//        System.out.println(number);

        SimpleFortranParser parser = getParser(args[0]);
        ParseTree antlrAST = parser.program();
        AntlrToProgram programVisitor = new AntlrToProgram();
        Program program = programVisitor.visit(antlrAST);

        if (SyntaxErrorListener.hasSyntaxErrors()) {
            return;
        }

        if (SemanticErrorsHandler.hasErrors()) {
            SemanticErrorsHandler.printErrors();
            return;
        }

        ExpressionProcessor expressionProcessor = new ExpressionProcessor(program.getExpressions());
        for (String evaluation : expressionProcessor.getEvaluationResults()) {
            System.out.println(evaluation);
        }
    }

    private static SimpleFortranParser getParser(String fileName) {
        SimpleFortranParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            SimpleFortranLexer lexer = new SimpleFortranLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new SimpleFortranParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}