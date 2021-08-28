package Model;

public class SignedOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "SIGN (+)";
    }

    @Override
    protected void performSemanticAnalysis() {

    }
}
