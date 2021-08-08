package Model;

public class ArithmeticIfStatementFortran extends IfStatementFortran {
    private ExpressionFortran expression;
    private SimpleStatementFortran simpleStatement;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    public void setSimpleStatement(SimpleStatementFortran simpleStatement) {
        this.simpleStatement = simpleStatement;
    }

    @Override
    public String toString() {
        return "IF (" + expression + ") " + simpleStatement + '\n';
    }
}
