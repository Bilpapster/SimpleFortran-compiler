package Model;

public class RepeatFortran extends ASTNodeFortran {
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

    public boolean hasRepeatFactor() {
        return hasConstant;
    }

    @Override
    public String toString() {
        if (!hasConstant) {
            return "*";
        }
        return integerConstant + "*";
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
