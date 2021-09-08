package Model;

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
        HashSet<String> alreadyCheckedIdentifiers = new HashSet<>();

        for (String identifier : identifiers) {
            if (alreadyCheckedIdentifiers.contains(identifier)) {
                System.err.println("Variable: " + identifier + " has already been declared in the same common at least once");
                continue;
            }

            if (!SymbolTableFortran.getInstance().containsIdentifier(identifier)) {
                System.err.println("Undefined variable: " + identifier + " is used in a common declaration.");
                continue;
            }

            alreadyCheckedIdentifiers.add(identifier);
        }

        SymbolTableFortran.getInstance().insertCommonBlock(name, alreadyCheckedIdentifiers);
    }
}
