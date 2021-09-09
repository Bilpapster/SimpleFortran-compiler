package Model.SymbolTable;

import Model.DataTypeFortran;
import Model.FunctionSpecificationFortran;

import java.util.Stack;
import java.util.HashSet;
import java.util.HashMap;

public class SymbolTableFortran {

    private static final SymbolTableFortran SINGLE_INSTANCE = new SymbolTableFortran();

    // identifiers
    private final HashMap<String, ScopeFortran> activeIdentifiers = new HashMap<>();
    private final Stack<ScopeFortran> activeScopesStack = new Stack<>();

    // functions
    private static final HashMap<String, FunctionSpecificationFortran> functions = new HashMap<>();
    private static final HashMap<String, FunctionSpecificationFortran> pendingFunctionCalls = new HashMap<>();
    private static final HashMap<String, DataTypeFortran> lookedAheadFunctions = new HashMap<>();

    // common blocks
    private static final HashMap<String, HashSet<String>> commonBlocks = new HashMap<>();

    private static int numberOfCurrentlyActiveScopes = 0;
    private static int maxNumberOfSimultaneouslyActiveScopes = 1;

    private SymbolTableFortran() {
        enter();
    }

    public static SymbolTableFortran getInstance() {
        return SINGLE_INSTANCE;
    }

    public void insertIdentifier(String identifier, DataTypeFortran dataType) {

        if (functions.containsKey(identifier)) {
            SemanticErrorsManager.addSemanticError("Variable: " + identifier + " clashes with a function named the same");
            return;
        }

        if (!activeIdentifiers.containsKey(identifier)) {
            activeIdentifiers.put(identifier, activeScopesStack.peek());
            activeScopesStack.peek().insert(identifier, dataType, null);
            return;
        }

        if (activeIdentifiers.get(identifier).equals(activeScopesStack.peek())) {
            SemanticErrorsManager.addSemanticError("Variable redefinition: " + identifier); //  todo create separate class for errors and warnings
            return;
        }

        ScopeFortran previousDefinition = activeIdentifiers.get(identifier);
        activeScopesStack.peek().insert(identifier, dataType, previousDefinition);
        activeIdentifiers.replace(identifier, activeScopesStack.peek());
        SemanticErrorsManager.addSemanticError("Successfully added shadowing definition of variable: " + identifier);
    }

    public void insertFunction(String functionName, FunctionSpecificationFortran functionSpecification) {
        if (functions.containsKey(functionName)) {
            SemanticErrorsManager.addSemanticError("A function with name: " + functionName + " has already been declared.");
            return;
        }
        functions.put(functionName, functionSpecification);
    }

    public void insertLookedAheadFunction(String functionName, DataTypeFortran returnType) {
        if (lookedAheadFunctions.containsKey(functionName)) {
            SemanticErrorsManager.addSemanticError("Function " + functionName + " is redeclared");
        }
        lookedAheadFunctions.put(functionName, returnType);
    }

    public DataTypeFortran getReturnTypeOfFunction(String functionName) {
        if (!lookedAheadFunctions.containsKey(functionName)) {
            return null;
        }
        return lookedAheadFunctions.get(functionName);
    }

    public boolean existsFunctionWithName(String functionName) {
        return lookedAheadFunctions.containsKey(functionName);
    }


    public void addPendingFunctionCall(String functionName, FunctionSpecificationFortran functionSpecification) {
        pendingFunctionCalls.put(functionName, functionSpecification);
    }

    public void checkPendingFunctionCalls() {
        for (String functionName : pendingFunctionCalls.keySet()) {
            if (!functions.get(functionName).equals(pendingFunctionCalls.get(functionName))) {
                SemanticErrorsManager.addSemanticError("There is no function " + functionName + " for this set of formal parameters.");
            }
        }
    }

    public void insertCommonBlock(String commonBlockName, HashSet<String> identifiers) {
        if (functions.containsKey(commonBlockName)) {
            SemanticErrorsManager.addSemanticError("Common block name " + commonBlockName + " clashes with a function named the same.");
            return;
        }

        if (commonBlocks.containsKey(commonBlockName)) {
            HashSet<String> alreadyDeclaredIdentifiers = commonBlocks.get(commonBlockName);
            for (String newIdentifier : identifiers) {
                if (alreadyDeclaredIdentifiers.contains(newIdentifier)) {
                    SemanticErrorsManager.addSemanticError("Identifier " + newIdentifier + " is declared more than once in the common named " + commonBlockName);
                    continue;
                }
                alreadyDeclaredIdentifiers.add(newIdentifier);
            }
            return;
        }

        commonBlocks.put(commonBlockName, identifiers);
    }

    public boolean containsCommonBlock(String commonBlockName) {
        return commonBlocks.containsKey(commonBlockName);
    }

    public HashSet<String> getCommonBlockIdentifiers(String commonBlockName) {
        return commonBlocks.get(commonBlockName);
    }

    public void enter() {
        numberOfCurrentlyActiveScopes++;
        activeScopesStack.push(new ScopeFortran(numberOfCurrentlyActiveScopes));

        if (numberOfCurrentlyActiveScopes > 1) {
            commonBlocks.clear();
        }

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

    public DataTypeFortran getTypeOf(String identifier) {
        if (!activeIdentifiers.containsKey(identifier)) {
            return null;
        }

        return activeIdentifiers.get(identifier).getTypeOf(identifier);
    }

    public String getReport() {
        return "Current number of active scopes: " + numberOfCurrentlyActiveScopes + '\n' +
                "Maximum number of active scopes: " + maxNumberOfSimultaneouslyActiveScopes;
    }

    public void print() {
        System.out.println(activeIdentifiers.keySet());
    }
}
