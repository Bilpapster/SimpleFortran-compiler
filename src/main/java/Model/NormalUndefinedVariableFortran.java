package Model;

public class NormalUndefinedVariableFortran extends UndefinedVariableFortran {
    @Override
    public String toString() {
        if (isList) return "LIST " + name;
        return name;
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
