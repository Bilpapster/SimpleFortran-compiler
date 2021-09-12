package Model;

import Model.SymbolTable.SemanticErrorsManager;
import Model.SymbolTable.SymbolTableFortran;

import java.util.List;

public class DataValueFortran extends ASTNodeFortran {
    private String identifier;
    private List<ValueFortran> values;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setValues(List<ValueFortran> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(identifier + " / " + values.get(0));

        for (int index = 1; index < values.size(); index++) {
            stringRepresentation.append(", ").append(values.get(index));
        }
        return stringRepresentation.append(" / ").toString();
    }

    @Override
    public void performSemanticAnalysis() {
        if (!SymbolTableFortran.getInstance().containsIdentifier(identifier)) {
            SemanticErrorsManager.addSemanticError("Undefined variable: " + identifier + " is used in a data declaration.");
            return;
        }

        DataTypeFortran variableType = SymbolTableFortran.getInstance().getTypeOfIdentifier(identifier);

        if (!variableType.isArray() && !variableType.isList()) {
            if (values.size() > 1) {
                SemanticErrorsManager.addSemanticError("Variable " + identifier + " is not declared as array but " +
                        "initialized as so (initialized as an array of )" + values.size() + " elements");
                return;
            }
            ValueFortran value = values.get(0);
            DataTypeFortran valueType = value.getDataType();
            if (variableType != valueType) {
                SemanticErrorsManager.addSemanticError("Variable " + identifier + " is of type " + variableType +
                        ", while value " + value.toString() + " is of type " + valueType);
            }
            return;
        }

        int emptyRepeatFactorCounter = 0;
        variableType.setAsArray(false);
        variableType.setAsList(false);

        for (ValueFortran value : values) {
            DataTypeFortran valueType = value.getDataType();

            if (variableType != valueType) {
                SemanticErrorsManager.addSemanticError("Variable " + identifier + " is of type " + variableType +
                        ", while value " + value.toString() + " is of type " + valueType);
            }

            if (value instanceof RepeatValueFortran) {
                RepeatValueFortran repeatValue = (RepeatValueFortran) value;
                if (!repeatValue.hasRepeatFactor()) {
                    emptyRepeatFactorCounter++;
                }
            }
        }

        if (emptyRepeatFactorCounter > 1) {
            SemanticErrorsManager.addSemanticError("Variable " + identifier + " is initialized using more than one (" +
                    emptyRepeatFactorCounter + ") repeat values with no repeat factor.");
        }
    }
}
