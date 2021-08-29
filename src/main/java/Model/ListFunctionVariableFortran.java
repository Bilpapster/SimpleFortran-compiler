package Model;

import java.util.List;

public class ListFunctionVariableFortran extends VariableFortran {
    private String listFunction;
    private List<ExpressionFortran> expressions;

    public void setListFunction(String listFunction) {
        this.listFunction = listFunction;
    }

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return listFunction + "(" + expressions.get(0) + ")";
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
