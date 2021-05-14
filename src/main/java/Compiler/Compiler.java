package Compiler;

import BaseClasses.SimpleFortranLexer;

import BaseClasses.SimpleFortranParser;
import Converters.AntlrToProgram;
import Listeners.CustomErrorListener;
import Model.ExpressionProcessor;
import Model.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Compiler {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage file name missing! Please pass the file path as argument and try again.");
            return;
        }

        float number = Float.parseFloat("+123.0000000000");
//        number /= 100;
//        number *= 100;
        System.out.println(number);

        SimpleFortranParser parser = getParser(args[0]);
        ParseTree antlrAST = parser.program();
        AntlrToProgram programVisitor = new AntlrToProgram();
        Program program = programVisitor.visit(antlrAST);

        if (CustomErrorListener.hasSyntaxErrors()) {
            return;
        }

        if (programVisitor.hasSemanticErrors()) {
            programVisitor.printSemanticErrors();
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
            parser.addErrorListener(new CustomErrorListener());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return parser;
    }
}