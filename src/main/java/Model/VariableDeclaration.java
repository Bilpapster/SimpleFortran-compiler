package Model;

public class VariableDeclaration implements Expression{
    private String name;
    private DataType dataType;
    private int value;

    public VariableDeclaration(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public VariableDeclaration(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
