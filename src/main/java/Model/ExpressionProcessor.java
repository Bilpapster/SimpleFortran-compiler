package Model;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class ExpressionProcessor {
    private final List<Expression> expressions;

    public ExpressionProcessor(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for (Expression expression : expressions) {
            if (expression instanceof VariableDeclaration) {
                VariableDeclaration declaration = (VariableDeclaration) expression;
                SymbolTable.putVariable(declaration.toString(), declaration.evaluate());
            }
            evaluations.add(expression.toString() + " = " + expression.evaluate());
        }
        return evaluations;
    }
}
