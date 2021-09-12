package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class MultiplicationOperationFortran extends BinaryOperationFortran{
    @Override
    public void setOperand() {
        this.operand = '*';
    }

    @Override
    public DataTypeFortran getDataType() {
        return getDataTypeOfArithmeticExpressionExceptForAdditionAndPowerOperation();
    }

    @Override
    public void performSemanticAnalysis() {
        performSemanticAnalysisOfArithmeticExpressionExceptForAdditionAndPowerOperation("multiplication");
    }
}
