package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class AdditionOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = '+';
    }

    @Override
    public DataTypeFortran getDataType() {
        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft == null || dataTypeRight == null) return null;

        if (dataTypeLeft.isArray() || dataTypeRight.isArray()) return null;

        if (dataTypeLeft == DataTypeFortran.CHARACTER || dataTypeRight == DataTypeFortran.CHARACTER) return null;

        if (dataTypeLeft == DataTypeFortran.LOGICAL || dataTypeRight == DataTypeFortran.LOGICAL) return null;

        if (dataTypeLeft.isArithmeticType()) {
            if (dataTypeRight.isArithmeticType()) return super.getDataType();
            return null;
        }

        if (!dataTypeLeft.equals(dataTypeRight)) return null;

        return dataTypeLeft;
    }

    @Override
    public void performSemanticAnalysis() {
        expressionLeft.performSemanticAnalysis();

        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft != null && dataTypeRight != null) {

            String errorMessage = "Incompatible data types in an addition operation. The left operator ('" +
                    expressionLeft.toString() + "') is of type " + dataTypeLeft +
                    ", while the right operator ('" + expressionRight.toString() + "') is of type " + dataTypeRight;

            if (dataTypeLeft.isArray() || dataTypeRight.isArray()) {
                SemanticErrorsManager.addSemanticError(errorMessage);
            }

            if (dataTypeLeft == DataTypeFortran.CHARACTER || dataTypeRight == DataTypeFortran.CHARACTER) {
                SemanticErrorsManager.addSemanticError(errorMessage);
            }

            if (dataTypeLeft == DataTypeFortran.LOGICAL || dataTypeRight == DataTypeFortran.LOGICAL) {
                SemanticErrorsManager.addSemanticError(errorMessage);
            }

            if ((!dataTypeLeft.isArithmeticType()) || (!dataTypeRight.isArithmeticType())) {
                if (!dataTypeLeft.equals(dataTypeRight)) {
                    SemanticErrorsManager.addSemanticError(errorMessage);
                }
            }
        }
        expressionRight.performSemanticAnalysis();
    }
}
