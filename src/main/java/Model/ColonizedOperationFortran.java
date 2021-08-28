package Model;

public class ColonizedOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = ':';
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
