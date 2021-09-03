package Model;

import Model.SymbolTable.SymbolTableFortran;

public class LoopStatementFortran extends CompoundStatementFortran{
    private String identifier;
    private IterationSpaceFortran iterationSpace;
    private BodyFortran body;

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setIterationSpace(IterationSpaceFortran iterationSpace) {
        this.iterationSpace = iterationSpace;
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }

    @Override
    public String toString() {

        return "DO " + identifier + " = " + iterationSpace.toString() + '\n' + body.toString() + "ENDDO";
    }

    @Override
    public void performSemanticAnalysis() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        symbolTable.enter();
        body.performSemanticAnalysis();
        symbolTable.exit();
    }
}
