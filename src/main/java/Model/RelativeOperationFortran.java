package Model;

public class RelativeOperationFortran extends BinaryOperationFortran {
    private String relationalOperand;

    @Override
    public void setOperand() {
        this.operand = '<';
    }

    public void setRelationalOperand(String relationalOperand) {
        this.relationalOperand = relationalOperand;
    }

    @Override
    public String toString() {
        return expressionLeft + " " + relationalOperand + " " + expressionRight;
    }
}
