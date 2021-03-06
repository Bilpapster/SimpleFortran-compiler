package Model;

public class LogicalIfStatementFortran extends IfStatementFortran{
    private IntegerConstantFortran labelLeft;
    private IntegerConstantFortran labelMiddle;
    private IntegerConstantFortran labelRight;

    public void setLabelLeft(IntegerConstantFortran labelLeft) {
        this.labelLeft = labelLeft;
    }

    public void setLabelMiddle(IntegerConstantFortran labelMiddle) {
        this.labelMiddle = labelMiddle;
    }

    public void setLabelRight(IntegerConstantFortran labelRight) {
        this.labelRight = labelRight;
    }

    @Override
    public String toString() {
        return "IF (" + expression + ") " + labelLeft + ", " + labelMiddle + ", " + labelRight + '\n';
    }
}
