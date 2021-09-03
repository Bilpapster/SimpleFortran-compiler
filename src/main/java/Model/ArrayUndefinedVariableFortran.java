package Model;

import java.util.List;

public class ArrayUndefinedVariableFortran extends UndefinedVariableFortran {
    private List<DimensionFortran> dimensions;

    public void setDimensions(List<DimensionFortran> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();

        if (this.isList()) stringRepresentation.append("LIST ");


        stringRepresentation.append(name).append("(").append(dimensions.get(0));
        for (int index = 1; index < dimensions.size(); index++) {
            stringRepresentation.append(", ").append(dimensions.get(index));
        }
        return stringRepresentation.append(")").toString();

    }

    public int getNumberOfDimensions() {
        return dimensions.size();
    }

    @Override
    public void performSemanticAnalysis() {
        super.performSemanticAnalysis();
        if (this.isList()) {
            System.err.println("Variable " + name + " is declared as both a list and an array.");
        }
    }
}
