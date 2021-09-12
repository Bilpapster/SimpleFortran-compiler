package Model;

public class ArithmeticIfStatementFortran extends IfStatementFortran {
    private SimpleStatementFortran simpleStatement;

    public void setSimpleStatement(SimpleStatementFortran simpleStatement) {
        this.simpleStatement = simpleStatement;
    }

    @Override
    public String toString() {
        return "IF (" + expression + ") " + simpleStatement + '\n';
    }

}
