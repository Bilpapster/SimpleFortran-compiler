package Model;

public abstract class ConstantFortran extends ASTNodeFortran {
    private String valueAsString;

    public abstract DataTypeFortran getDataType();
}
