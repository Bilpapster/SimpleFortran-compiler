package Model;

public class ImplicitLoopReadItemFortran extends ReadItemFortran{
    private ReadListFortran readList;
    private String identifier;
    private IterationSpaceFortran iterationSpace;

    public void setReadList(ReadListFortran readList) {
        this.readList = readList;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setIterationSpace(IterationSpaceFortran iterationSpace) {
        this.iterationSpace = iterationSpace;
    }

    @Override
    public String toString() {
        return "(" +
                readList.toString() +
                ", " +
                identifier +
                " = " +
                iterationSpace.toString() +
                ")";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
