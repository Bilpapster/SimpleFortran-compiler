package Model;

public class DimensionFortran {
    private int integerValue;
    private String identifier;
    private boolean isIdentifier;

    public void setIntegerValue(int integerValue) {
        this.integerValue = integerValue;
        this.isIdentifier = false;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
        this.isIdentifier = true;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        if (isIdentifier) return identifier;
        return Integer.toString(integerValue);
    }
}
