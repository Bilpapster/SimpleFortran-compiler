package Model.SymbolTable;

import Model.DataTypeFortran;

import java.util.HashMap;

public class TypeProcessor {
    private static final HashMap<DataTypeFortran, Integer> uniqueIdsMapping = new HashMap<>();
    private static final HashMap<Integer, HashMap<Integer, DataTypeFortran>> resultTypes = new HashMap<>();

    private static final int INTEGER_ID = 0;
    private static final int REAL_ID = 1;
    private static final int COMPLEX_ID = 2;

    static {
        initializeUniqueIdsMapping();
        initializeResultTypes();
    }

    private static void initializeUniqueIdsMapping() {
        uniqueIdsMapping.put(DataTypeFortran.INTEGER, INTEGER_ID);
        uniqueIdsMapping.put(DataTypeFortran.REAL, REAL_ID);
        uniqueIdsMapping.put(DataTypeFortran.COMPLEX, COMPLEX_ID);
    }

    private static void initializeResultTypes() {
        initializeResultsOnIntegerOperand();
        initializeResultsOnRealOperand();
        initializeResultsOnComplexOperand();
    }

    private static void initializeResultsOnIntegerOperand() {
        HashMap<Integer, DataTypeFortran> resultsOnIntegerOperand = new HashMap<>();

        resultsOnIntegerOperand.put(uniqueIdsMapping.get(DataTypeFortran.INTEGER), DataTypeFortran.INTEGER);
        resultsOnIntegerOperand.put(uniqueIdsMapping.get(DataTypeFortran.REAL), DataTypeFortran.REAL);
        resultsOnIntegerOperand.put(uniqueIdsMapping.get(DataTypeFortran.COMPLEX), DataTypeFortran.COMPLEX);

        resultTypes.put(uniqueIdsMapping.get(DataTypeFortran.INTEGER), resultsOnIntegerOperand);
    }

    private static void initializeResultsOnRealOperand() {
        HashMap<Integer, DataTypeFortran> resultsOnRealOperand = new HashMap<>();

        resultsOnRealOperand.put(uniqueIdsMapping.get(DataTypeFortran.INTEGER), DataTypeFortran.REAL);
        resultsOnRealOperand.put(uniqueIdsMapping.get(DataTypeFortran.REAL), DataTypeFortran.REAL);
        resultsOnRealOperand.put(uniqueIdsMapping.get(DataTypeFortran.COMPLEX), DataTypeFortran.COMPLEX);

        resultTypes.put(uniqueIdsMapping.get(DataTypeFortran.REAL), resultsOnRealOperand);
    }

    private static void initializeResultsOnComplexOperand() {
        HashMap<Integer, DataTypeFortran> resultsOnComplexOperand = new HashMap<>();

        resultsOnComplexOperand.put(uniqueIdsMapping.get(DataTypeFortran.INTEGER), DataTypeFortran.COMPLEX);
        resultsOnComplexOperand.put(uniqueIdsMapping.get(DataTypeFortran.REAL), DataTypeFortran.COMPLEX);
        resultsOnComplexOperand.put(uniqueIdsMapping.get(DataTypeFortran.COMPLEX), DataTypeFortran.COMPLEX);

        resultTypes.put(uniqueIdsMapping.get(DataTypeFortran.INTEGER), resultsOnComplexOperand);
    }

    public static DataTypeFortran getResultType(DataTypeFortran leftOperand, DataTypeFortran rightOperand) {
        int leftOperandId = uniqueIdsMapping.get(leftOperand);
        int rightOperandId = uniqueIdsMapping.get(rightOperand);
        return resultTypes.get(leftOperandId).get(rightOperandId);
    }
}
