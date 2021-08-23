package Model;

import java.util.List;

public class BodyFortran {
    private List<DeclarationFortran> declarations;
    private List<LabeledStatementFortran> statements;

    public void setDeclarations(List<DeclarationFortran> declarations) {
        this.declarations = declarations;
    }

    public void setStatements(List<LabeledStatementFortran> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();

        for (DeclarationFortran declaration : declarations) {
            stringRepresentation.append(declaration).append('\n');
        }

        for (LabeledStatementFortran statement : statements) {
            stringRepresentation.append(statement).append('\n');
        }

        return stringRepresentation.toString();
    }
}
