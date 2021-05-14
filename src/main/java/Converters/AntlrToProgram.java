package Converters;

import BaseClasses.SimpleFortranBaseVisitor;
import BaseClasses.SimpleFortranParser;
import Model.Program;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends SimpleFortranBaseVisitor<Program> {
    private List<String> semanticErrors = new ArrayList<>();

    @Override
    public Program visitProgram(SimpleFortranParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToExpression expressionVisitor = new AntlrToExpression(semanticErrors);
        for (int child = 0; child < ctx.getChildCount() - 1; child++) { // -1 because of EOF
            program.addExpression(expressionVisitor.visit(ctx.getChild(child)));
        }
        return program;
    }

    public boolean hasSemanticErrors() {
        return !semanticErrors.isEmpty();
    }

    public void printSemanticErrors() {
        System.out.println("list of semantic errors:");
        for (String semanticError : semanticErrors) {
            System.out.println(semanticError);
        }
    }
}
