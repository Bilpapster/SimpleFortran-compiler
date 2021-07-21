package Model;

import java.util.List;

public class BodyFortran {
    private List<DeclarationFortran> declarations;
    private List<StatementInterfaceFortran> statements;

    public void setDeclarations(List<DeclarationFortran> declarations) {
        this.declarations = declarations;
    }

    public void setStatements(List<StatementInterfaceFortran> statements) {
        this.statements = statements;
    }
}
