package Model;

public class NormalStatementFortran implements StatementInterfaceFortran{
    protected StatementFortran statement;

    public void setStatement(StatementFortran statement) {
        this.statement = statement;
    }
}
