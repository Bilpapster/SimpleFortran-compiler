package Model;

public class ColonizedOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = ':';
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
