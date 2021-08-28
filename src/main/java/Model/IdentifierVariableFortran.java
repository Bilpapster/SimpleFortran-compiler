package Model;

public class IdentifierVariableFortran extends VariableFortran {
    private String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
