package Model;

public class LogicalConstantFortran extends SimpleConstantFortran{
    private boolean actualValue;

    public LogicalConstantFortran(boolean actualValue) {
        this.actualValue = actualValue;
    }

    public void setActualValue(boolean actualValue) {
        this.actualValue = actualValue;
    }
}
