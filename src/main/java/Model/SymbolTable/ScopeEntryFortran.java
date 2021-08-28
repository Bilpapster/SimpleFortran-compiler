package Model.SymbolTable;

import Model.DataTypeFortran;

public class ScopeEntryFortran {
    private DataTypeFortran dataType;
    private ScopeFortran previousDefinition;

    public DataTypeFortran getDataType() {
        return dataType;
    }

    public void setDataType(DataTypeFortran dataType) {
        this.dataType = dataType;
    }

    public ScopeFortran getPreviousDefinition() {
        return previousDefinition;
    }

    public void setPreviousDefinition(ScopeFortran previousDefinition) {
        this.previousDefinition = previousDefinition;
    }
}
