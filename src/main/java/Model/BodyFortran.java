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

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();

        for (DeclarationFortran declaration : declarations) {
            stringRepresentation.append(declaration).append('\n');
        }

        for (StatementInterfaceFortran statement : statements) {
            stringRepresentation.append(statements).append('\n');
        }

        return stringRepresentation.toString();
    }
}
