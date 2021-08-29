package Model;

public class VariableReadItemFortran extends ReadItemFortran {
    private VariableFortran variable;

    public void setVariable(VariableFortran variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return variable.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
