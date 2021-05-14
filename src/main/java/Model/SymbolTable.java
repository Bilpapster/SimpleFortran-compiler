package Model;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private static Map<String, Integer> values = new HashMap<>();

    public static boolean containsVariable(String variableName) {
        return values.containsKey(variableName);
    }

    public static int getValueOfVariable(String variableName) {
        return values.get(variableName);
    }

    public static void putVariable(String variableName, int value) {
        values.put(variableName, value);
    }
}
