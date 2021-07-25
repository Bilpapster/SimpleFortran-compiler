package Model;

public abstract class BinaryOperationFortran implements ExpressionFortran{
    protected ExpressionFortran expressionLeft;
    protected ExpressionFortran expressionRight;

    public void setExpressionLeft(ExpressionFortran expressionLeft) {
        this.expressionLeft = expressionLeft;
    }

    public void setExpressionRight(ExpressionFortran expressionRight) {
        this.expressionRight = expressionRight;
    }
}
