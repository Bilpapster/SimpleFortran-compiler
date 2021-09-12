package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class AssignmentStatementFortran extends SimpleStatementFortran {
    private VariableFortran variable;
    private ExpressionFortran expression;

    public void setVariable(VariableFortran variable) {
        this.variable = variable;
    }

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return variable + " = " + expression;
    }

    @Override
    public void performSemanticAnalysis() {
        variable.performSemanticAnalysis();
        expression.performSemanticAnalysis();

        if (variable.getDataType() == null || expression.getDataType() == null) {
            return;
        }

        DataTypeFortran variableType = variable.getDataType();
        DataTypeFortran expressionType = expression.getDataType();

        if (variableType.equals(expressionType)) {
            // types are compatible, nothing more needs to be done
            return;
        }

        if (variableType.isArithmeticExceptForComplex() && expressionType.isArithmeticExceptForComplex()) {
            // types are compatible, nothing more needs to be done
            return;
        }

        String errorMessage = "Incompatible types used in an assignment statement ('" + this.toString() +
                "'). Left side is of type " +
                variableType + (", while right side is of type " + expressionType);
        SemanticErrorsManager.addSemanticError(errorMessage);
    }
}
