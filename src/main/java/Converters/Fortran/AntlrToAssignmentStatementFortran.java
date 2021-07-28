package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.AssignmentStatementFortran;

public class AntlrToAssignmentStatementFortran extends SimpleFortran2BaseVisitor<AssignmentStatementFortran> {
    @Override
    public AssignmentStatementFortran visitAssignment(SimpleFortran2Parser.AssignmentContext ctx) {
        AssignmentStatementFortran assignmentStatement = new AssignmentStatementFortran();

        AntlrToVariableFortran variableVisitor = new AntlrToVariableFortran();
        assignmentStatement.setVariable(variableVisitor.visit(ctx.variable()));

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        assignmentStatement.setExpression(expressionVisitor.visit(ctx.expression()));

        return assignmentStatement;
    }
}
