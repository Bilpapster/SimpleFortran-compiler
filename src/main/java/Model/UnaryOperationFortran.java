package Model;

public abstract class UnaryOperationFortran extends ExpressionFortran {
    protected ExpressionFortran expression;
    protected String operand;

    public UnaryOperationFortran() {
        this.setOperand();
    }

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    public abstract void setOperand();

    @Override
    public String toString() {
        return operand + " " + expression;
    }

    @Override
    public DataTypeFortran getDataType() {
        return expression.getDataType();
    }
}
