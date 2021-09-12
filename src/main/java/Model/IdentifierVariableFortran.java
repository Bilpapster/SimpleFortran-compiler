package Model;

import Model.SymbolTable.SemanticErrorsManager;
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
        if (SymbolTableFortran.getInstance().containsIdentifier(identifier)) {
            return;
        }

        if (SymbolTableFortran.getInstance().existsFunctionWithName(identifier)) {
            return;
        }

        SemanticErrorsManager.addSemanticError("Undefined reference to identifier " + identifier);
    }

    @Override
    public DataTypeFortran getDataType() {
        return SymbolTableFortran.getInstance().getTypeOfIdentifier(identifier);
    }
}
