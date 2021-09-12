package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class OrOperationFortran extends BinaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = '|';
    }

    @Override
    public void performSemanticAnalysis() {
        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft == DataTypeFortran.LOGICAL && dataTypeRight == DataTypeFortran.LOGICAL) {
            // types are compatible, nothing more needs to be done
            return;
        }

        String errorMessage = "Incompatible data types for an or-operation. " +
                "The left operator ('" + expressionLeft.toString() + "') is of type " + dataTypeLeft +
                ", while the right operator ('" + expressionRight.toString() + "') is of type " + dataTypeRight + ".";
        SemanticErrorsManager.addSemanticError(errorMessage);
    }
}
