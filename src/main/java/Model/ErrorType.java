package Model;

import java.util.HashMap;

public enum ErrorType{
    SYNTAX_ERROR, SEMANTIC_ERROR,
    ;

    private HashMap<String, String> errorDescriptions = new HashMap<>();

    public static String getErrorDescription() {
        return "a";
    }
}
