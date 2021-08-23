package Model;

import java.util.List;

public class VariableDeclarationFortran implements DeclarationFortran {
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
}
