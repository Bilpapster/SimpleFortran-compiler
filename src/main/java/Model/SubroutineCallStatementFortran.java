package Model;

public class SubroutineCallStatementFortran extends SimpleStatementFortran {
    private VariableFortran variable;

    public void setVariable(VariableFortran variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "CALL " + variable.toString() + '\n';
    }
}
