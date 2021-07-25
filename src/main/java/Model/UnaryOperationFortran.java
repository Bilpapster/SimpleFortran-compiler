package Model;

public abstract class UnaryOperationFortran implements ExpressionFortran{
    protected ExpressionFortran expression;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }
}
