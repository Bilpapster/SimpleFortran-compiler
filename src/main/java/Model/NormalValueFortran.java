package Model;

public class NormalValueFortran implements ValueFortran{
    protected ConstantFortran constant;

    public void setConstant(ConstantFortran constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return this.constant.toString();
    }
}
