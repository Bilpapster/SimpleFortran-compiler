package Model;

public class VariableOperationFortran implements ExpressionFortran{
    private VariableFortran variable;

    public void setVariable(VariableFortran variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable.toString();
    }
}
