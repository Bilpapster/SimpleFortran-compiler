package Model;

public class MinusSignedOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "-";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
