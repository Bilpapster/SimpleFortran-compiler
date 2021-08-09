package Model;

public class NormalGoToStatementFortran extends GoToStatementFortran {
    protected IntegerConstantFortran label;

    public void setLabel(IntegerConstantFortran label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "GOTO " + label + '\n';
    }
}
