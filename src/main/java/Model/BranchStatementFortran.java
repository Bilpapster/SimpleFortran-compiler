package Model;

public class BranchStatementFortran extends CompoundStatementFortran{
    private ExpressionFortran expression;
    private BodyFortran body;
    private TailFortran tail;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }

    public void setTail(TailFortran tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "IF(" + expression.toString() + ") THEN\n" +  body.toString() + '\n' + tail.toString();

    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
