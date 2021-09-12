package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class NewOperationFortran extends UnaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = "NEW";
    }

    @Override
    public DataTypeFortran getDataType() {
        DataTypeFortran expressionType = expression.getDataType();
        expressionType.setAsList(true);
        return expressionType;
    }

    @Override
    public void performSemanticAnalysis() {
        if (!expression.getDataType().isArithmeticType()) {
            SemanticErrorsManager.addSemanticError("Incompatible type in a new-operation ('" + this.toString() +
                    "'): parameter is of type " + expression.getDataType() + " (expected arithmetic).");
        }
    }
}
