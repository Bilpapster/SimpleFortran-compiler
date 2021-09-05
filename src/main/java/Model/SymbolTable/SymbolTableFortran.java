package Model.SymbolTable;

import Model.DataTypeFortran;
import Model.FunctionSpecificationFortran;

import java.util.Stack;
import java.util.HashSet;
import java.util.HashMap;

public class SymbolTableFortran {

    private static final SymbolTableFortran SINGLE_INSTANCE = new SymbolTableFortran();

    private final HashMap<String, ScopeFortran> activeIdentifiers = new HashMap<>();
    private final Stack<ScopeFortran> activeScopesStack = new Stack<>();

    private static int numberOfCurrentlyActiveScopes = 0;
    private static int maxNumberOfSimultaneouslyActiveScopes = 1;

    private static final HashSet<String> functionNames = new HashSet<>();

    private static final HashMap<String, FunctionSpecificationFortran> functions = new HashMap<>();

    private static final HashMap<String, FunctionSpecificationFortran> pendingFunctionCalls = new HashMap<>();


    private SymbolTableFortran() {
        enter();
    }

    public static SymbolTableFortran getInstance() {
        return SINGLE_INSTANCE;
    }

    public void insert(String identifier, DataTypeFortran dataType) {

        if (functionNames.contains(identifier)) {
            System.err.println("Variable: " + identifier + " clashes with the language keyword");
            return;
        }

        if (!activeIdentifiers.containsKey(identifier)) {
            activeIdentifiers.put(identifier, activeScopesStack.peek());
            activeScopesStack.peek().insert(identifier, dataType, null);
            System.out.println("Successfully added undeclared variable: " + identifier);
            return;
        }

        if (activeIdentifiers.get(identifier).equals(activeScopesStack.peek())) {
            System.err.println("Variable redefinition: " + identifier); //  todo create separate class for errors and warnings
            return;
        }

        ScopeFortran previousDefinition = activeIdentifiers.get(identifier);
        activeScopesStack.peek().insert(identifier, dataType, previousDefinition);
        activeIdentifiers.replace(identifier, activeScopesStack.peek());
        System.out.println("Successfully added shadowing definition of variable: " + identifier);
    }

    public void insertFunctionNameOld(String identifier, DataTypeFortran dataTypeFortran) {
        if (functionNames.contains(identifier)) {
            System.err.println("Function redefinition: " + identifier);
            return;
        }

        this.insert(identifier, dataTypeFortran);
        functionNames.add(identifier);
    }

    public void insertFunction(String functionName, FunctionSpecificationFortran functionSpecification) {
        if (functions.containsKey(functionName)) {
            System.err.println("A function with name: " + functionName + " has already been declared.");
            return;
        }
        functions.put(functionName, functionSpecification);
    }


    public void addPendingFunctionCall(String functionName, FunctionSpecificationFortran functionSpecification) {
        pendingFunctionCalls.put(functionName, functionSpecification);
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

    public void clear() {
        activeScopesStack.clear();
        activeIdentifiers.clear();
        numberOfCurrentlyActiveScopes = 0;
        enter();
    }

    public String getReport() {
        return "Current number of active scopes: " + numberOfCurrentlyActiveScopes + '\n' +
                "Maximum number of active scopes: " + maxNumberOfSimultaneouslyActiveScopes;
    }
}
