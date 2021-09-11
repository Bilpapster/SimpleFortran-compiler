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

    @Override
    public String toString() {
        if (isList) return this.name() + " LIST";
        return this.name() + " ";
    }
}
