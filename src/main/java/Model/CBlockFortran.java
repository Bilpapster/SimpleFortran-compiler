package Model;

import Model.SymbolTable.SemanticErrorsManager;
import Model.SymbolTable.SymbolTableFortran;

import java.util.HashSet;
import java.util.List;

public class CBlockFortran extends ASTNodeFortran {
    private String name;
    private List<String> identifiers;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder("/ " + name + identifiers.get(0));

        for (int index = 1; index < identifiers.size(); index++) {
            stringRepresentation.append(", ").append(identifiers.get(index));
        }

        return stringRepresentation.toString();
    }

    @Override
    public void performSemanticAnalysis() {

        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        HashSet<String> alreadyCheckedIdentifiers;

        if (symbolTable.containsCommonBlock(name)) {
            alreadyCheckedIdentifiers = symbolTable.getCommonBlockIdentifiers(name);
        } else {
            alreadyCheckedIdentifiers = new HashSet<>();
        }


        for (String identifier : identifiers) {
            if (alreadyCheckedIdentifiers.contains(identifier)) {
                SemanticErrorsManager.addSemanticError("Variable: " + identifier + " has already been declared in the same common at least once");
                continue;
            }

            if (!SymbolTableFortran.getInstance().containsIdentifier(identifier)) {
                SemanticErrorsManager.addSemanticError("Undefined variable: " + identifier + " is used in a common declaration.");
                continue;
            }

            alreadyCheckedIdentifiers.add(identifier);
        }

        SymbolTableFortran.getInstance().insertCommonBlock(name, alreadyCheckedIdentifiers);
    }
}
