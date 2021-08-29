package Model;

public class OrOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '|';
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
