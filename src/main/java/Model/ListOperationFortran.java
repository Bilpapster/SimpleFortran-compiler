package Model;

import Model.SymbolTable.SemanticErrorsManager;

import java.util.List;

public class ListOperationFortran extends ExpressionFortran {
    private List<ExpressionFortran> expressions;

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        if (expressions.isEmpty()) {
            return "[empty_list_of_expressions]\n";
        }

        StringBuilder stringRepresentation = new StringBuilder();

        stringRepresentation.append(expressions.get(0));

        for (int index = 1; index < expressions.size(); index++) {
            stringRepresentation.append(", ").append(expressions.get(index));
        }

        return stringRepresentation.append('\n').toString();
    }

    @Override
    public void performSemanticAnalysis() {
        if (expressions.isEmpty()) {
            return;
        }

        DataTypeFortran dataTypeOfFirstElement = expressions.get(0).getDataType();
        if (dataTypeOfFirstElement.isArray()) {
            SemanticErrorsManager.addSemanticError("The first element ('" +
                    expressions.get(0).toString() + " of the list expression is an array, which is not allowed.");
            return;
        }

        for (int expressionCounter = 1; expressionCounter < expressions.size(); expressionCounter++) {
            if (!expressions.get(expressionCounter).getDataType().equals(dataTypeOfFirstElement)) {
                SemanticErrorsManager.addSemanticError("The data type of the list element '" +
                        expressions.get(expressionCounter).toString() + "' (" +
                        expressions.get(expressionCounter).getDataType().toString() +
                        ") clashes with the data type of the first element of the list (" +
                        dataTypeOfFirstElement + "). All elements in a list have to be of the same type.");
            }
        }
    }

    @Override
    public DataTypeFortran getDataType() {
        return expressions.get(0).getDataType().setAsList(true);
    }
}
