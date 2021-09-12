package Model;

public enum DataTypeFortran {
    INTEGER, REAL, COMPLEX, LOGICAL, CHARACTER, STRING;

    private boolean isList = false;
    private boolean isArray = false;

    public DataTypeFortran setAsList() {
        this.isList = true;
        return this;
    }

    public DataTypeFortran setAsList(boolean isList) {
        this.isList = isList;
        return this;
    }

    public DataTypeFortran setAsArray() {
        this.isArray = true;
        return this;
    }

    public DataTypeFortran setAsArray(boolean isArray) {
        this.isArray = isArray;
        return this;
    }

    public boolean isList() {
        return isList;
    }

    public boolean isArray() {
        return isArray;
    }

    public boolean isArithmeticType() {
        if (this.isArray()) return false;
        if (this.isList()) return false;
        return (this == INTEGER || this == REAL || this == COMPLEX);
    }

    public boolean isArithmeticExceptForComplex() {
        return isArithmeticType() && this != COMPLEX;
    }

    @Override
    public String toString() {
        if (isList()) return this.name() + " LIST";
        if (isArray()) return this.name() + " ARRAY";
        return this.name() + " ";
    }

    public boolean equals(DataTypeFortran other) {
        return this.toString().equals(other.toString());
    }
}
