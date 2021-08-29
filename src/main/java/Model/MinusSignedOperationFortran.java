package Model;

public class MinusSignedOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "-";
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
