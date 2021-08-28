package Model;

public class NotOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "NOT";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
