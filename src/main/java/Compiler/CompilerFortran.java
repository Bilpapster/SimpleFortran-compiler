package Compiler;

import BaseClassesFortran.SimpleFortran2Lexer;
import BaseClassesFortran.SimpleFortran2Parser;
import Converters.Fortran.AntlrToProgramFortran;
import Model.ProgramFortran;
import Model.SymbolTable.SemanticErrorsManager;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import ErrorHandling.SyntaxErrorListener;

import java.io.IOException;

public class CompilerFortran {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Unacceptable number of main arguments through command line. Please put just ONE and try again");
            return;
        }

        SimpleFortran2Parser parser = getParser(args[0]);
        ParseTree antlrAST = parser.program();
        AntlrToProgramFortran programVisitor = new AntlrToProgramFortran();
        ProgramFortran program = programVisitor.visit(antlrAST);
//        System.out.println(program.toString());

        program.performSemanticAnalysis();

        if (SemanticErrorsManager.hasSemanticErrors()) {
            SemanticErrorsManager.printSemanticErrors();
            return;
        }
        System.out.println("Program compiles successfully");
    }

    private static SimpleFortran2Parser getParser(String fileName) {
        SimpleFortran2Parser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            SimpleFortran2Lexer lexer = new SimpleFortran2Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new SimpleFortran2Parser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SyntaxErrorListener());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parser;
    }

}
