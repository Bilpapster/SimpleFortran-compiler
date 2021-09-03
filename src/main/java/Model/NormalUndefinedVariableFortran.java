package Model;

public class NormalUndefinedVariableFortran extends UndefinedVariableFortran {
    @Override
    public String toString() {
        if (this.isList()) return "LIST " + name;
        return name;
    }

    @Override
    public void performSemanticAnalysis() {
        super.performSemanticAnalysis();
    }
}
