package Model;

public abstract class BinaryOperationFortran extends ExpressionFortran{
    protected ExpressionFortran expressionLeft;
    protected ExpressionFortran expressionRight;
    protected char operand;

    public BinaryOperationFortran() {
        this.setOperand();
    }

    public void setExpressionLeft(ExpressionFortran expressionLeft) {
        this.expressionLeft = expressionLeft;
    }

    public void setExpressionRight(ExpressionFortran expressionRight) {
        this.expressionRight = expressionRight;
    }

    public abstract void setOperand();

    @Override
    public String toString() {
        return this.expressionLeft + " " + operand + " " + expressionRight;
    }
}
