package Model;

import java.util.List;

import Model.SymbolTable.SemanticErrorsManager;
import Model.SymbolTable.SymbolTableFortran;

public class ArrayAccessVariableFortran extends VariableFortran {
    private String identifier;
    private List<ExpressionFortran> expressions;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(identifier + "(");

        stringRepresentation.append(expressions.get(0));

        for (int index = 1; index < expressions.size(); index++) {
            stringRepresentation.append(", ").append(expressions.get(index));
        }
        return stringRepresentation.append(")").toString();
    }

    @Override
    public void performSemanticAnalysis() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();

        if (symbolTable.existsFunctionWithName(identifier)) {
            FunctionSpecificationFortran functionSpecification = new FunctionSpecificationFortran(symbolTable.getReturnTypeOfFunction(identifier));
            for (ExpressionFortran expression : expressions) {
                functionSpecification.addParameter(expression.getDataType());
            }
            symbolTable.addPendingFunctionCall(identifier, functionSpecification);
            return;
        }

        if (symbolTable.containsIdentifier(identifier)) {
            DataTypeFortran declaredType = symbolTable.getTypeOfIdentifier(identifier);
            if (!declaredType.isArray()) {
                SemanticErrorsManager.addSemanticError("Identifier" + identifier + "is not declared as an array " +
                        "but accessed as so.");
                return;
            }

            for (ExpressionFortran expression : expressions) {
                if (expression.getDataType() != DataTypeFortran.INTEGER) {
                    SemanticErrorsManager.addSemanticError("Expression '" + expression.toString() +
                            "' is used in an array access but is of type " + expression.getDataType() +
                            " (expected INTEGER).");
                }
            }
            return;
        }

        SemanticErrorsManager.addSemanticError("Undefined call to identifier " + identifier + ". " +
                "There is no matching definition to use.");
    }

    @Override
    public DataTypeFortran getDataType() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        if (symbolTable.existsFunctionWithName(identifier)) {
            return symbolTable.getReturnTypeOfFunction(identifier);
        }

        if (symbolTable.containsIdentifier(identifier)) {
            return symbolTable.getTypeOfIdentifier(identifier);
        }

        return null;
    }
}
