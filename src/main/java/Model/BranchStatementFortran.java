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
}
