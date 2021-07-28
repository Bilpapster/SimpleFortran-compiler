package Model;

public class LabeledStatementFortran extends NormalStatementFortran{
    private IntegerConstantFortran label;

    public void setLabel(IntegerConstantFortran label) {
        this.label = label;
    }
}
