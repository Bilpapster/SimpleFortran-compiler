package Model;

import java.util.List;

public class DataValueFortran extends ASTNodeFortran{
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
        //todo
    }
}
