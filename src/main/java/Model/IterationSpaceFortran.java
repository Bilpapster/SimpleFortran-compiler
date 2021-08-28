package Model;

public class IterationSpaceFortran extends ASTNodeFortran {
    private ExpressionFortran expressionLeft;
    private ExpressionFortran expressionRight;
    private ExpressionFortran step;
    // make the default step equal to 1?


    public void setExpressionLeft(ExpressionFortran expressionLeft) {
        this.expressionLeft = expressionLeft;
    }

    public void setExpressionRight(ExpressionFortran expressionRight) {
        this.expressionRight = expressionRight;
    }

    public void setStep(ExpressionFortran step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return expressionLeft.toString() + " up to " + expressionRight.toString() + " with step " + step.toString();
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
