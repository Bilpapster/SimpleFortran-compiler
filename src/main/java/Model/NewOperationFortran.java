package Model;

public class NewOperationFortran extends UnaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = "NEW";
    }
}
