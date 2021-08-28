package Model;

public class SubtractionOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '-';
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
