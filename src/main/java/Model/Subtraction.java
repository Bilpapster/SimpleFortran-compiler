package Model;

public class Subtraction extends BinaryOperation{
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected void specifyOperand() {
        this.operand = '-';
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
