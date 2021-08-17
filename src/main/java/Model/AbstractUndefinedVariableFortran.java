package Model;

public abstract class AbstractUndefinedVariableFortran implements UndefinedVariableFortran {
    protected String name;
    protected boolean isList;

    public void setName(String name) {
        this.name = name;
    }

    public void setIsList(boolean isList) {
        this.isList = isList;
    }
}
