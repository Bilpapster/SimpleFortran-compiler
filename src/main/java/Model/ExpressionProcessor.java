package Model;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class ExpressionProcessor {
    private List<Expression> expressions;
    private static Map<String, Integer> values = new HashMap<>();
    // symbol table for storing the values of variables


    public ExpressionProcessor(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for (Expression expression : expressions) {
            if (expression instanceof VariableDeclaration) {
                VariableDeclaration declaration = (VariableDeclaration) expression;
                values.put(declaration.toString(), declaration.evaluate());
            }
            evaluations.add(expression.toString() + " = " + expression.evaluate());
        }
        return evaluations;
    }

    public static int getValueOfVariable(String variableName) {
        if (values.containsKey(variableName)) {
            return values.get(variableName);
        }
        return 0;
    }
}
