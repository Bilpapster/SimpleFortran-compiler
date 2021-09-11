package Model;

import Model.SymbolTable.SemanticErrorsManager;

public abstract class UndefinedVariableFortran extends ASTNodeFortran {
    protected String name;
    private boolean isList;
    protected DataTypeFortran dataType = null;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isList() {
        return dataType.isList();
    }

    public void setIsList(boolean isList) {
        this.isList = isList;
        if (dataType != null) {
            dataType.setAsList(isList);
        }

    }

    public void setDataType(DataTypeFortran dataType) {
        this.dataType = dataType;
        dataType.setAsList(isList);
    }

    public DataTypeFortran getDataType() {
        return dataType;
    }

    @Override
    public void performSemanticAnalysis() {
        if (this.dataType == DataTypeFortran.STRING) {
            if (this.isList()) {
                SemanticErrorsManager.addSemanticError("Variable " + name + " cannot be declared as a list of String variables.");
            }
        }
    }
}
