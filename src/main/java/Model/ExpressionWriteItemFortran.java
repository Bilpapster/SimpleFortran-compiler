package Model;

public class ExpressionWriteItemFortran extends WriteItemFortran {
    private ExpressionFortran expression;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
