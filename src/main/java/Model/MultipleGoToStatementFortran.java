package Model;

import java.util.List;

public class MultipleGoToStatementFortran extends GoToStatementFortran {
    private String identifier;
    private List<IntegerConstantFortran> labels;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setLabels(List<IntegerConstantFortran> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder("GOTO " + identifier + ", (");

        stringRepresentation.append(labels.get(0));
        for (int index = 1; index < labels.size(); index++) {
            stringRepresentation.append(", ").append(labels.get(index));
        }

        return stringRepresentation.append(")\n").toString();
    }
}
