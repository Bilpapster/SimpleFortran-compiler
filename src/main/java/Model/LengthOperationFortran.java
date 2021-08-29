package Model;

public class LengthOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "LENGTH";
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
