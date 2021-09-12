package Model.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorsManager {
    private static final List<String> semanticErrors = new ArrayList<>();

    public static void addSemanticError(String semanticError) {
        semanticErrors.add(semanticError);
    }

    public static boolean hasSemanticErrors() {
        return !semanticErrors.isEmpty();
    }

    public static void printSemanticErrors() {
        if (!hasSemanticErrors()) {
            return;
        }

        System.err.println("The program could not compile due to the following semantic error(s): \n");
        int semanticErrorsCounter = 0;
        for (String semanticError : semanticErrors) {
            System.err.println(++semanticErrorsCounter + ". " + semanticError);
        }
    }
}
