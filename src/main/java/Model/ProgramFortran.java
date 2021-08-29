package Model;

import java.util.ArrayList;
import java.util.List;

public class ProgramFortran extends ASTNodeFortran{
    protected BodyFortran body;
    private List<SubprogramFortran> subprograms;

    public ProgramFortran() {
        this.body = new BodyFortran();
        this.subprograms = new ArrayList<>();
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }

    public void setSubprograms(List<SubprogramFortran> subprograms) {
        this.subprograms = subprograms;
    }

    public void addSubprogram(SubprogramFortran subprogram) {
        this.subprograms.add(subprogram);
    }

    @Override
    public String toString() {
        if (subprograms.isEmpty()) return body + "END\n";

        StringBuilder stringRepresentation = new StringBuilder(body.toString() + "END\n");
        for (SubprogramFortran subprogram : subprograms) {
            stringRepresentation.append(subprogram).append('\n');
        }
        return stringRepresentation.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        body.performSemanticAnalysis();
    }
}
