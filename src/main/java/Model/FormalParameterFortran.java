package Model;

import Model.SymbolTable.SymbolTableFortran;

import java.util.List;

public class FormalParameterFortran extends ASTNodeFortran {
    private DataTypeFortran dataType;
    private List<UndefinedVariableFortran> variables;

    public void setDataType(DataTypeFortran dataType) {
        this.dataType = dataType;
    }

    public DataTypeFortran getDataType() {
        return this.dataType;
    }

    public void setVariables(List<UndefinedVariableFortran> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(this.dataType.toString()).append(variables.get(0));

        for (int index = 1; index < variables.size(); index++) {
            stringRepresentation.append(", ").append(variables.get(index));
        }

        return stringRepresentation.toString();

    }

    @Override
    public void performSemanticAnalysis() {
        for (UndefinedVariableFortran variable : variables) {
            variable.performSemanticAnalysis();
            SymbolTableFortran.getInstance().insertIdentifier(variable.getName(), dataType);
        }
    }

    public int getNumberOfParameters() {
        return variables.size();
    }
}
