package Model;

import Model.SymbolTable.SymbolTableFortran;

import java.util.List;

public class VariableDeclarationFortran extends DeclarationFortran {
    private DataTypeFortran dataType;
    private List<UndefinedVariableFortran> variables;

    public void setDataType(DataTypeFortran dataType) {
        this.dataType = dataType;
    }

    public void setVariables(List<UndefinedVariableFortran> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(dataType.toString() + variables.get(0));

        for (int index = 1; index < variables.size(); index++) {
            stringRepresentation.append(", ").append(variables.get(index));
        }

        return stringRepresentation.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        for (UndefinedVariableFortran undefinedVariable : variables) {
            undefinedVariable.setDataType(dataType);
            undefinedVariable.performSemanticAnalysis();
            symbolTable.insertIdentifier(undefinedVariable.getName(), dataType);
        }
    }
}
