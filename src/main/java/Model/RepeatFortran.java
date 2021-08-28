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

    @Override
    public String toString() {
        if (!hasConstant) {
            return "*";
        }
        return integerConstant + "*";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
