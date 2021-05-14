package Model;

public class Multiplication extends BinaryOperation{

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected void specifyOperand() {
        this.operand = '*';
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
