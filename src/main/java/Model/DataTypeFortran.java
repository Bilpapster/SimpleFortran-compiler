package Model;

public enum DataTypeFortran {
    INTEGER, REAL, COMPLEX, LOGICAL, CHARACTER, STRING;

    private boolean isList = false;

    public void setAsList() {
        this.isList = true;
    }
}
