package Converters;

import Model.Declarations.VariableDeclarationOld;
import Model.Expressions.Expression;
import Model.SymbolTableOld;

import java.util.ArrayList;
import java.util.List;

public class ExpressionProcessor {
    private final List<Expression> expressions;

    public ExpressionProcessor(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public List<String> getEvaluationResults() {
        List<String> evaluations = new ArrayList<>();

        for (Expression expression : expressions) {
            if (expression instanceof VariableDeclarationOld) {
                VariableDeclarationOld declaration = (VariableDeclarationOld) expression;
                SymbolTableOld.putVariable(declaration.toString(), declaration.evaluate());
            }
            evaluations.add(expression.toString() + " = " + expression.evaluate());
        }
        return evaluations;
    }
}
