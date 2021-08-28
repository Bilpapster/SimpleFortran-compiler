package Model;

public abstract class HeaderFortran extends ASTNodeFortran {
    protected String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
