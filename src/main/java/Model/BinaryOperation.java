package Model;

public abstract class BinaryOperation implements Expression{
    protected Expression left;
    protected Expression right;
    protected char operand;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        specifyOperand();
    }

    protected abstract void specifyOperand();

    @Override
    public abstract int evaluate();

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() + " " + operand + " " + right.toString();
    }
}
