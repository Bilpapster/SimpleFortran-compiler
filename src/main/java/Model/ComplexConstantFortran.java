package Model;

public class ComplexConstantFortran extends ConstantFortran{
    private FloatConstantFortran left;
    private FloatConstantFortran right;
    private String rightPartSign;

    public void setLeft(FloatConstantFortran left) {
        this.left = left;
    }

    public void setRight(FloatConstantFortran right) {
        this.right = right;
    }

    public void setRightPartSign(String rightPartSign) {
        this.rightPartSign = rightPartSign;
    }
}
