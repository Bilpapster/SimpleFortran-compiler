package Model.Expressions.BinaryOperations;

import Model.Expressions.Expression;

public class Addition extends BinaryOperation{
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected void specifyOperand() {
        this.operand = '+';
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
