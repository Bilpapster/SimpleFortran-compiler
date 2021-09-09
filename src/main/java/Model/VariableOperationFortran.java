package Model;

import Model.SymbolTable.SymbolTableFortran;

public class VariableOperationFortran extends ExpressionFortran {
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

    @Override
    public DataTypeFortran getDataType() {
        return variable.getDataType();
    }
}
