package ErrorHandling;

import java.util.ArrayList;
import java.util.List;

public class SemanticErrorsHandler {
    private static final List<String> semanticErrors = new ArrayList<>();

    public static void addError(String errorDescription) {
        semanticErrors.add(errorDescription);
    }

    public static boolean hasErrors() {
        return !semanticErrors.isEmpty();
    }

    public static void printErrors() {
        System.out.println("The program could not compile, due to the following error(s):");
        for (String semanticError : semanticErrors) {
            System.err.println(semanticError);
        }
    }
}
