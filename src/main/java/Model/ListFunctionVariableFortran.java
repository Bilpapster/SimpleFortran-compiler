package Model;

import java.util.List;

public class ListFunctionVariableFortran implements VariableFortran {
    private String listFunction;
    private List<ExpressionFortran> expressions;

    public void setListFunction(String listFunction) {
        this.listFunction = listFunction;
    }

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }
}
