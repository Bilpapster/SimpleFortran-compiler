package Model;

public class RepeatFortran {
    private IntegerConstantFortran integerConstant;
    private boolean hasConstant = false;

    public RepeatFortran() {
    }

    public RepeatFortran(IntegerConstantFortran integerConstant) {
        this.setIntegerConstant(integerConstant);
    }

    public void setIntegerConstant(IntegerConstantFortran integerConstant) {
        this.integerConstant = integerConstant;
        this.hasConstant = true;
    }
}
