package Model;

public abstract class AbstractUndefinedVariableFortran implements UndefinedVariableFortran {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
}
