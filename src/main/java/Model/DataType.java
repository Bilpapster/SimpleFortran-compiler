package Model;

import java.util.HashMap;

public enum DataType {
    INT, FLOAT, DOUBLE, STRING, BOOLEAN,
    ;

    private static HashMap<DataType, Integer> arithmeticTypesPrecedence = new HashMap<>();

    static {
        initializeArithmeticTypesPrecedence();
    }

    private static void initializeArithmeticTypesPrecedence() {
        arithmeticTypesPrecedence.put(INT, 0);
        arithmeticTypesPrecedence.put(FLOAT, 1);
        arithmeticTypesPrecedence.put(DOUBLE, 2);
    }

    public static boolean areEquivalent(DataType left, DataType right) {
        return left.toString().equals(right.toString());
    }

    public static DataType fromString(String dataTypeName) {
        return DataType.valueOf(dataTypeName);
    }
}
