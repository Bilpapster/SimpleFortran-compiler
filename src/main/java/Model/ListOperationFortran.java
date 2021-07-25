package Model;

import java.util.List;

public class ListOperationFortran implements ExpressionFortran{
    private List<ExpressionFortran> expressions;

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }
}
