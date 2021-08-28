package Model;

public class NormalUndefinedVariableFortran extends UndefinedVariableFortran {
    @Override
    public String toString() {
        if (isList) return "LIST " + name;
        return name;
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
