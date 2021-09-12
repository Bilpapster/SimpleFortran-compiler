package Model;

import Model.SymbolTable.SemanticErrorsManager;
import Model.SymbolTable.TypeProcessor;

public abstract class BinaryOperationFortran extends ExpressionFortran{
    protected ExpressionFortran expressionLeft;
    protected ExpressionFortran expressionRight;
    protected char operand;

    public BinaryOperationFortran() {
        this.setOperand();
    }

    public void setExpressionLeft(ExpressionFortran expressionLeft) {
        this.expressionLeft = expressionLeft;
    }

    public void setExpressionRight(ExpressionFortran expressionRight) {
        this.expressionRight = expressionRight;
    }

    public abstract void setOperand();

    @Override
    public String toString() {
        return this.expressionLeft + " " + operand + " " + expressionRight;
    }

    @Override
    public DataTypeFortran getDataType() {
        return TypeProcessor.getResultType(expressionLeft.getDataType(), expressionRight.getDataType());
    }

    protected DataTypeFortran getDataTypeOfArithmeticExpressionExceptForAdditionAndPowerOperation() {
        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft == null || dataTypeRight == null) return null;

        if (dataTypeLeft.isArithmeticType() && dataTypeRight.isArithmeticType()){
            return TypeProcessor.getResultType(dataTypeLeft, dataTypeRight);
        }

        return null;
    }

    protected void performSemanticAnalysisOfArithmeticExpressionExceptForAdditionAndPowerOperation(String operationName) {
        expressionLeft.performSemanticAnalysis();

        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft != null && dataTypeRight != null) {

            String errorMessage = "Incompatible data types in a " + operationName + " operation. The left operator ('" +
                    expressionLeft.toString() + "') is of type " + dataTypeLeft +
                    ", while the right operator ('" + expressionRight.toString() + "') is of type " + dataTypeRight;

            if ((!dataTypeLeft.isArithmeticType()) || (!dataTypeRight.isArithmeticType())) {
                SemanticErrorsManager.addSemanticError(errorMessage);
            }
        }

        expressionRight.performSemanticAnalysis();
    }
}
