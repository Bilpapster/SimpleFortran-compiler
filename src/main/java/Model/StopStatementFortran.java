package Model;

public class StopStatementFortran extends SimpleStatementFortran {
    @Override
    public String toString() {
        return "STOP\n";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
