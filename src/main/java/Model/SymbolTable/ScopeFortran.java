package Model.SymbolTable;

import Model.DataTypeFortran;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class ScopeFortran {
    private final HashMap<String, ScopeEntryFortran> declaredVariables = new HashMap<>();
    private final int id;

    public ScopeFortran(int id) {
        this.id = id;
    }

    public void insert(String identifier, DataTypeFortran dataType, ScopeFortran previousDefinition) {
        this.declaredVariables.put(identifier, new ScopeEntryFortran(dataType, previousDefinition));
    }

    public DataTypeFortran getTypeOf(String keyIdentifier) {
        if (declaredVariables.containsKey(keyIdentifier)) {
            return declaredVariables.get(keyIdentifier).getDataType();
        }
        return null;
    }

    public ScopeEntryFortran get(String identifier) {
        return declaredVariables.get(identifier);
    }

    public List<String> getIdentifiersList() {
        return new ArrayList<>(declaredVariables.keySet());
    }

    public boolean containsIdentifier(String identifier) {
        return declaredVariables.containsKey(identifier);
    }

    public int getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof ScopeFortran)) {
            return false;
        }

        ScopeFortran other = (ScopeFortran) obj;
        return this.id == other.getId();
    }
}
