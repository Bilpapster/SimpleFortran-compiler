package Model;

public class IterationSpaceFortran {
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
}
