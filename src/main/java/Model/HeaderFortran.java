package Model;

public abstract class HeaderFortran extends ASTNodeFortran {
    protected String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void performSmartLookAhead() {
        // purposely left blank
    }
}
