package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class MinusSignedOperationFortran extends UnaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = "-";
    }

    @Override
    public void performSemanticAnalysis() {
        if (this.expression.getDataType().isArithmeticType()) {
            return;
        }

        SemanticErrorsManager.addSemanticError("Expression '" + expression.toString() +
                "' is used in a signed operation but is of type " + this.getDataType() +
                " (expected arithmetic type).");
    }
}
