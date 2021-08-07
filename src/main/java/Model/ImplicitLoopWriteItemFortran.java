package Model;

public class ImplicitLoopWriteItemFortran implements WriteItemFortran {
    private WriteListFortran writeList;
    private String identifier;
    private IterationSpaceFortran iterationSpace;

    public void setWriteList(WriteListFortran writeList) {
        this.writeList = writeList;
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
                writeList.toString() +
                ", " +
                identifier +
                " = " +
                iterationSpace.toString() +
                ")";
    }
}
