package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class PowerOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = '^';
    }

    @Override
    public void performSemanticAnalysis() {

        String errorMessage = "Incompatible data types for power operation. Base is of type "
                + expressionLeft.getDataType()
                + ", while exponent is of type "
                + expressionRight.getDataType()
                + ". This combination of data types is not acceptable by the language reference.";

        if (expressionRight.getDataType() == DataTypeFortran.COMPLEX) {
            SemanticErrorsManager.addSemanticError(errorMessage);
            return;
        }

        if (expressionLeft.getDataType() == DataTypeFortran.COMPLEX) {
            if (expressionRight.getDataType() == DataTypeFortran.REAL) {
                SemanticErrorsManager.addSemanticError(errorMessage);
            }
        }
    }
}
