package Model;

import Model.SymbolTable.SemanticErrorsManager;

public abstract class IfStatementFortran extends SimpleStatementFortran{
    protected ExpressionFortran expression;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }


    @Override
    public void performSemanticAnalysis() {
        if (expression.getDataType() != DataTypeFortran.LOGICAL) {
            SemanticErrorsManager.addSemanticError("Incompatible type in an if statement ('" + this.toString() +
                    "'). The expression used is of type " + expression.getDataType() + " (expected LOGICAL)");
        }
    }
}
