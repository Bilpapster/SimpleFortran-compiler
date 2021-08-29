package Model;

public class IntegerConstantFortran extends ArithmeticConstantFortran {
    private int actualValue;

    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }

    public int getActualValue() {
        return actualValue;
    }

    @Override
    public String toString() {
        return Integer.toString(actualValue);
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
