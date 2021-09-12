package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class LengthOperationFortran extends UnaryOperationFortran {
    @Override
    public void setOperand() {
        this.operand = "LENGTH";
    }

    @Override
    public DataTypeFortran getDataType() {
        DataTypeFortran returnType = DataTypeFortran.INTEGER;
        returnType.setAsList(false);
        returnType.setAsArray(false);
        return returnType;
    }

    @Override
    public void performSemanticAnalysis() {
        if (!expression.getDataType().isList()) {
            SemanticErrorsManager.addSemanticError("Incompatible parameter type in length operation ('" +
                    this.toString() + "'). The parameter is of type " + expression.getDataType() +
                    " (expecting LIST).");
        }
    }
}
