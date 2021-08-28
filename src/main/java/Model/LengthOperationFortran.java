package Model;

public class LengthOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "LENGTH";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
