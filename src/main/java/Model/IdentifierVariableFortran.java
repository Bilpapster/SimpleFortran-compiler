package Model;

import Model.SymbolTable.SymbolTableFortran;

public class IdentifierVariableFortran extends VariableFortran {
    private String identifier;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }

    @Override
    public DataTypeFortran getDataType() {
        return SymbolTableFortran.getInstance().getTypeOfIdentifier(identifier);
    }
}
