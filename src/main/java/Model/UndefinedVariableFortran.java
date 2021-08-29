package Model;

public abstract class UndefinedVariableFortran extends ASTNodeFortran {
    protected String name;
    protected boolean isList;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsList() {
        return this.isList;
    }

    public void setIsList(boolean isList) {
        this.isList = isList;
    }
}
