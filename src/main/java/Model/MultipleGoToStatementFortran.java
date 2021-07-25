package Model;

import java.util.List;

public class MultipleGoToStatementFortran extends GoToStatementFortran{
    private String identifier;
    private List<IntegerConstantFortran> labels;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setLabels(List<IntegerConstantFortran> labels) {
        this.labels = labels;
    }
}
