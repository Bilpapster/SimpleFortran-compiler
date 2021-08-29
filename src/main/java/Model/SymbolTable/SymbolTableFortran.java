package Model.SymbolTable;

import Model.DataTypeFortran;

import java.util.Stack;
import java.util.HashMap;

public class SymbolTableFortran {

    private static final SymbolTableFortran SINGLE_INSTANCE = new SymbolTableFortran();

    private final HashMap<String, ScopeFortran> activeIdentifiers = new HashMap<>();
    private final Stack<ScopeFortran> activeScopesStack = new Stack<>();

    private static int numberOfCurrentlyActiveScopes = 0;
    private static int maxNumberOfSimultaneouslyActiveScopes = 1;


    private SymbolTableFortran() {
        enter();
    }

    public static SymbolTableFortran getInstance() {
        return SINGLE_INSTANCE;
    }

    public void insert(String identifier, DataTypeFortran dataType) {
        if (!activeIdentifiers.containsKey(identifier)) {
            activeIdentifiers.put(identifier, activeScopesStack.peek());
            activeScopesStack.peek().insert(identifier, dataType, null);
            return;
        }

        if (activeIdentifiers.get(identifier).equals(activeScopesStack.peek())) {
            System.err.println("Variable redefinition"); //  todo create separate class for errors and warnings
        }

        ScopeFortran previousDefinition = activeIdentifiers.get(identifier);
        activeScopesStack.peek().insert(identifier, dataType, previousDefinition);
        activeIdentifiers.replace(identifier, activeScopesStack.peek());

    }

    public void enter() {
        numberOfCurrentlyActiveScopes++;
        activeScopesStack.push(new ScopeFortran(numberOfCurrentlyActiveScopes));
        checkPossibleMaxActiveScopes();
    }

    public void exit() {

        for (String identifier : activeScopesStack.peek().getIdentifiersList()) {
            ScopeEntryFortran scopeEntry = activeScopesStack.peek().get(identifier);

            if (scopeEntry.getPreviousDefinition() == null) {
                activeIdentifiers.remove(identifier);
            } else {
                ScopeFortran previousDefinition = scopeEntry.getPreviousDefinition();
                activeIdentifiers.replace(identifier, previousDefinition);
            }
        }

        activeScopesStack.pop();
        numberOfCurrentlyActiveScopes--;
    }

    private void checkPossibleMaxActiveScopes() {
        if (numberOfCurrentlyActiveScopes > maxNumberOfSimultaneouslyActiveScopes) {
            maxNumberOfSimultaneouslyActiveScopes = numberOfCurrentlyActiveScopes;
        }
    }

    public boolean containsIdentifier(String identifier) {
        return activeIdentifiers.containsKey(identifier);
    }

    public String getReport() {
        return "Current number of active scopes: " + numberOfCurrentlyActiveScopes + '\n' +
                "Maximum number of active scopes: " + maxNumberOfSimultaneouslyActiveScopes;
    }
}
