package Model;

public class LabeledStatementFortran extends ASTNodeFortran {
    private IntegerConstantFortran label;
    private boolean hasLabel = false;
    private StatementFortran statement;

    public void setLabel(IntegerConstantFortran label) {
        this.label = label;
        this.hasLabel = true;
    }

    public void setStatement(StatementFortran statement) {
        this.statement = statement;
    }

    public IntegerConstantFortran getLabel() {
        return label;
    }

    public boolean getLabelStatus() {
        return hasLabel;
    }

    public StatementFortran getStatement() {
        return statement;
    }

    @Override
    public String toString() {
        if (hasLabel) return label + " " + statement;
        return statement.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
