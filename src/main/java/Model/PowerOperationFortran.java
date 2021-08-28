package Model;

public class PowerOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '^';
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
