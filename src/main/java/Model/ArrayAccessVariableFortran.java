package Model;

import Model.SymbolTable.SymbolTableFortran;

import java.util.List;

public class ArrayAccessVariableFortran extends VariableFortran {
    private String identifier;
    private List<ExpressionFortran> expressions;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setExpressions(List<ExpressionFortran> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(identifier + "(");

        stringRepresentation.append(expressions.get(0));

        for (int index = 1; index < expressions.size(); index++) {
            stringRepresentation.append(", ").append(expressions.get(index));
        }
        return stringRepresentation.append(")").toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }

    @Override
    public DataTypeFortran getDataType() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        if (symbolTable.existsFunctionWithName(identifier)) {
            return symbolTable.getReturnTypeOfFunction(identifier);
        }

        if (symbolTable.containsIdentifier(identifier)) {
            return symbolTable.getTypeOf(identifier);
        }

        return null;
    }
}
