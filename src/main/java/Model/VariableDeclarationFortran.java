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
}
