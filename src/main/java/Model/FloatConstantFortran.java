package Model;

public class FloatConstantFortran extends ArithmeticConstantFortran {
    private float actualValue;


    public void setActualValue(float actualValue) {
        this.actualValue = actualValue;
    }

    @Override
    public String toString() {
        return Float.toString(actualValue);
    }
}
