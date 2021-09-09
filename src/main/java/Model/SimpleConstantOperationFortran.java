package Model;

public class SimpleConstantOperationFortran extends ExpressionFortran{
    private SimpleConstantFortran simpleConstant;

    public void setSimpleConstant(SimpleConstantFortran simpleConstant) {
        this.simpleConstant = simpleConstant;
    }

    @Override
    public String toString() {
        return simpleConstant.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }

    @Override
    public DataTypeFortran getDataType() {
        return simpleConstant.getDataType();
    }
}
