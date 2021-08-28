package Model.Expressions.UnaryOperations;

import Model.DataType;
import Model.Expressions.Expression;
import Model.SymbolTableOld;

public class Variable implements Expression {
    private String name;
    private DataType dataType;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int evaluate() {
        return SymbolTableOld.getValueOfVariable(this.name);
    }
}
