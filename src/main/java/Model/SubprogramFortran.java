package Model;

import Model.SymbolTable.SymbolTableFortran;

public class SubprogramFortran extends ProgramFortran{
    private HeaderFortran header;
    private BodyFortran body;

    public void setHeader(HeaderFortran header) {
        this.header = header;
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }

    @Override
    public String toString() {

        return header.toString() +
                '\n' +
                body.toString() +
                "END";
    }

    @Override
    public void performSemanticAnalysis() {
        SymbolTableFortran.getInstance().clear();
        header.performSemanticAnalysis();
        body.performSemanticAnalysis();
    }

    public void performSmartLookAhead() {
        header.performSmartLookAhead();
    }
}
