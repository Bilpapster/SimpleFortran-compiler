package Model;

public class AssignmentStatementFortran extends SimpleStatementFortran {
    private VariableFortran variable;
    private ExpressionFortran expression;

    public void setVariable(VariableFortran variable) {
        this.variable = variable;
    }

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return variable + " = " + expression + '\n';
    }
}
