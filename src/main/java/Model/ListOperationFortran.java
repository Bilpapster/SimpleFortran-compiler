package Model;

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
        //todo
    }
}
