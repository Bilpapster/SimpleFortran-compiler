package Model;

public class NormalUndefinedVariableFortran extends AbstractUndefinedVariableFortran {
    @Override
    public String toString() {
        if (isList) return "LIST " + name;
        return name;
    }
}
