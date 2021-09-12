package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class NotOperationFortran extends UnaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = "NOT";
    }

    @Override
    public void performSemanticAnalysis() {
        DataTypeFortran expressionType = expression.getDataType();

        if (expressionType == null) {
            return;
        }

        if (expressionType != DataTypeFortran.LOGICAL) {
            SemanticErrorsManager.addSemanticError("Incompatible data type for a not-operation. The operator is" +
                    " of type" + expressionType + " (expected LOGICAL).");
        }
    }
}
