package Model;

import java.util.ArrayList;
import java.util.List;

public class ProgramFortran {
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
}
