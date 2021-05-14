package Model;

import java.util.List;
import java.util.ArrayList;

public class Program {
    private List<Expression> expressions = new ArrayList<>();

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public List getExpressions() {
        return expressions;
    }
}
