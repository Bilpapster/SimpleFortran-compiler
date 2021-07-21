package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.BranchStatementFortran;

public class AntlrToBranchStatementFortran extends SimpleFortran2BaseVisitor<BranchStatementFortran> {
    @Override
    public BranchStatementFortran visitBranch_statement(SimpleFortran2Parser.Branch_statementContext ctx) {
        BranchStatementFortran branchStatement = new BranchStatementFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        branchStatement.setExpression(expressionVisitor.visit(ctx.expression()));

        AntlrToBodyFortran bodyVisitor = new AntlrToBodyFortran();
        branchStatement.setBody(bodyVisitor.visit(ctx.body()));

        AntlrToTailFortran tailVisitor = new AntlrToTailFortran();
        branchStatement.setTail(tailVisitor.visit(ctx.tail()));


        return branchStatement;
    }
}
