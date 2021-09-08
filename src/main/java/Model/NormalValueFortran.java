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
    public void performSemanticAnalysis() {
        //todo
    }

    @Override
    public DataTypeFortran getDataType() {
        return constant.getDataType();
    }
}
