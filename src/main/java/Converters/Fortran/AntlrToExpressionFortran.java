package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.*;

public class AntlrToExpressionFortran extends SimpleFortran2BaseVisitor<ExpressionFortran> {

    @Override
    public ExpressionFortran visitOrOperation(SimpleFortran2Parser.OrOperationContext ctx) {
        OrOperationFortran orOperation = new OrOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        orOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        orOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return orOperation;
    }

    @Override
    public ExpressionFortran visitAndOperation(SimpleFortran2Parser.AndOperationContext ctx) {
        AndOperationFortran andOperation = new AndOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        andOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        andOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return andOperation;
    }

    @Override
    public ExpressionFortran visitRelativeOperation(SimpleFortran2Parser.RelativeOperationContext ctx) {
        RelativeOperationFortran relativeOperation = new RelativeOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        relativeOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        relativeOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return relativeOperation;
    }

    @Override
    public ExpressionFortran visitAdditionOperation(SimpleFortran2Parser.AdditionOperationContext ctx) {
        AdditionOperationFortran additionOperation = new AdditionOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        additionOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        additionOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return additionOperation;
    }

    @Override
    public ExpressionFortran visitMultiplicationOperation(SimpleFortran2Parser.MultiplicationOperationContext ctx) {
        MultiplicationOperationFortran multiplicationOperation = new MultiplicationOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        multiplicationOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        multiplicationOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return multiplicationOperation;
    }

    @Override
    public ExpressionFortran visitDivisionOperation(SimpleFortran2Parser.DivisionOperationContext ctx) {
        DivisionOperationFortran divisionOperation = new DivisionOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        divisionOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        divisionOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return divisionOperation;
    }

    @Override
    public ExpressionFortran visitPowerOperation(SimpleFortran2Parser.PowerOperationContext ctx) {
        PowerOperationFortran powerOperation = new PowerOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        powerOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        powerOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return powerOperation;
    }

    @Override
    public ExpressionFortran visitNotOperation(SimpleFortran2Parser.NotOperationContext ctx) {
        NotOperationFortran notOperation = new NotOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        notOperation.setExpression(expressionVisitor.visit(ctx.expression()));

        return notOperation;
    }

    @Override
    public ExpressionFortran visitSignedOperation(SimpleFortran2Parser.SignedOperationContext ctx) {
        SignedOperationFortran signedOperation = new SignedOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        signedOperation.setExpression(expressionVisitor.visit(ctx.expression()));

        return signedOperation;
    }

    @Override
    public ExpressionFortran visitVariableOperation(SimpleFortran2Parser.VariableOperationContext ctx) {
        VariableOperationFortran variableOperation = new VariableOperationFortran();

        AntlrToVariableFortran variableVisitor = new AntlrToVariableFortran();
        variableOperation.setVariable(variableVisitor.visit(ctx.variable()));

        return variableOperation;
    }

    @Override
    public ExpressionFortran visitSimpleConstantOperation(SimpleFortran2Parser.SimpleConstantOperationContext ctx) {
        SimpleConstantOperationFortran simpleConstantOperation = new SimpleConstantOperationFortran();

        AntlrToSimpleConstantFortran simpleConstantVisitor = new AntlrToSimpleConstantFortran();
        simpleConstantOperation.setSimpleConstant(simpleConstantVisitor.visit(ctx.simple_constant()));

        return simpleConstantOperation;
    }

    @Override
    public ExpressionFortran visitLengthOperation(SimpleFortran2Parser.LengthOperationContext ctx) {
        LengthOperationFortran lengthOperation = new LengthOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        lengthOperation.setExpression(expressionVisitor.visit(ctx.expression()));

        return lengthOperation;
    }

    @Override
    public ExpressionFortran visitNewOperation(SimpleFortran2Parser.NewOperationContext ctx) {
        NewOperationFortran newOperation = new NewOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        newOperation.setExpression(expressionVisitor.visit(ctx.expression()));

        return newOperation;
    }

    @Override
    public ExpressionFortran visitParenthesizedOperation(SimpleFortran2Parser.ParenthesizedOperationContext ctx) {
        // todo merge parenthesized operation into normal expressions by returning visit(ctx.expression), creating an instance of ParenthesizedOperation class

        NewOperationFortran newOperation = new NewOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        newOperation.setExpression(expressionVisitor.visit(ctx.expression()));

        return newOperation;
    }

    @Override
    public ExpressionFortran visitColonizedOperation(SimpleFortran2Parser.ColonizedOperationContext ctx) {
        ColonizedOperationFortran colonizedOperation = new ColonizedOperationFortran();

        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        colonizedOperation.setExpressionLeft(expressionVisitor.visit(ctx.expression(0)));
        colonizedOperation.setExpressionRight(expressionVisitor.visit(ctx.expression(1)));

        return colonizedOperation;
    }

    @Override
    public ExpressionFortran visitListOperation(SimpleFortran2Parser.ListOperationContext ctx) {
        return new AntlrToListExpressionFortran().visit(ctx.listexpression());
    }

    @Override
    public ExpressionFortran visitNormalStep(SimpleFortran2Parser.NormalStepContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ExpressionFortran visitEmptyStep(SimpleFortran2Parser.EmptyStepContext ctx) {
        // todo make default step equal to an expression that is 1

        return super.visitEmptyStep(ctx);
    }
}
