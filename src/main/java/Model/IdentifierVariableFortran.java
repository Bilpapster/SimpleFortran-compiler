package Model;

public class IdentifierVariableFortran implements VariableFortran {
    private String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
