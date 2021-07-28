package Model;

public class StringConstantFortran extends SimpleConstantFortran{
    private String actualValue;

    public StringConstantFortran(String actualValue) {
        this.actualValue = actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }
}
