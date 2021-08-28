package Model;

public enum DataTypeFortran {
    INTEGER, REAL, COMPLEX, LOGICAL, CHARACTER, STRING;

    private boolean isList = false;

    public DataTypeFortran setAsList() {
        this.isList = true;
        return this;
    }

    public DataTypeFortran setAsList(boolean isList) {
        this.isList = isList;
        return this;
    }

    @Override
    public String toString() {
        if (isList) return this.name() + " LIST";
        return this.name() + " ";
    }
}
