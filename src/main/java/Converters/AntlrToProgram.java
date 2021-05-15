package Converters;

import BaseClasses.SimpleFortranBaseVisitor;
import BaseClasses.SimpleFortranParser;
import Model.Program;

public class AntlrToProgram extends SimpleFortranBaseVisitor<Program> {

    @Override
    public Program visitProgram(SimpleFortranParser.ProgramContext ctx) {
        Program program = new Program();
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        for (int child = 0; child < ctx.getChildCount() - 1; child++) { // -1 because of EOF
            program.addExpression(expressionVisitor.visit(ctx.getChild(child)));
        }
        return program;
    }
}
