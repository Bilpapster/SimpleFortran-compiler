package Model;

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
}
