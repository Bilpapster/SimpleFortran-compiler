package Model;

public class DivisionOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = '/';
    }

    @Override
    public void performSemanticAnalysis() {
        performSemanticAnalysisOfArithmeticExpressionExceptForAdditionAndPowerOperation("division");
    }
}
