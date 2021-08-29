package Model;

public class AdditionOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '+';
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
