package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ArithmeticIfStatementFortran;
import Model.IfStatementFortran;
import Model.LogicalIfStatementFortran;

public class AntlrToIfStatementFortran extends SimpleFortran2BaseVisitor<IfStatementFortran> {

    private final AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();

    @Override
    public IfStatementFortran visitLogicalIfStatement(SimpleFortran2Parser.LogicalIfStatementContext ctx) {
        LogicalIfStatementFortran logicalIfStatement = new LogicalIfStatementFortran();

        logicalIfStatement.setExpression(expressionVisitor.visit(ctx.expression()));

        AntlrToIntegerConstantFortran integerConstantVisitor = new AntlrToIntegerConstantFortran();
        logicalIfStatement.setLabelLeft(integerConstantVisitor.visit(ctx.label(0)));
        logicalIfStatement.setLabelMiddle(integerConstantVisitor.visit(ctx.label(1)));
        logicalIfStatement.setLabelRight(integerConstantVisitor.visit(ctx.label(2)));

        return logicalIfStatement;
    }

    @Override
    public IfStatementFortran visitArithmeticIfStatement(SimpleFortran2Parser.ArithmeticIfStatementContext ctx) {
        ArithmeticIfStatementFortran arithmeticIfStatement = new ArithmeticIfStatementFortran();

        arithmeticIfStatement.setExpression(expressionVisitor.visit(ctx.expression()));

        AntlrToSimpleStatementFortran simpleStatementVisitor = new AntlrToSimpleStatementFortran();
        arithmeticIfStatement.setSimpleStatement(simpleStatementVisitor.visit(ctx.simple_statement()));

        return arithmeticIfStatement;
    }
}
