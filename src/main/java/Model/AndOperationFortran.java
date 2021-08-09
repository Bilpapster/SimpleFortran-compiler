package Model;

public class AndOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '&';
    }
}
