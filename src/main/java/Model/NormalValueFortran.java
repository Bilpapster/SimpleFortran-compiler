package Model;

public class NormalValueFortran extends  ValueFortran{
    protected ConstantFortran constant;

    public void setConstant(ConstantFortran constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return this.constant.toString();
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
