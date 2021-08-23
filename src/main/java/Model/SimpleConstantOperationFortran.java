package Model;

public class SimpleConstantOperationFortran implements ExpressionFortran{
    private SimpleConstantFortran simpleConstant;

    public void setSimpleConstant(SimpleConstantFortran simpleConstant) {
        this.simpleConstant = simpleConstant;
    }

    @Override
    public String toString() {
        return simpleConstant.toString();
    }
}
