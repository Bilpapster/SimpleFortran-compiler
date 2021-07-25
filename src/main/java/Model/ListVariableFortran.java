package Model;

import java.util.List;

public class ListVariableFortran implements VariableFortran {
    private String identifier;
    private List<ExpressionFortran> expressions;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }
}