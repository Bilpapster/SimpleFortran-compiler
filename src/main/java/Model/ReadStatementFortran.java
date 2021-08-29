package Model;

public class ReadStatementFortran extends IOStatementFortran {
    private ReadListFortran readList;

    public void setReadList(ReadListFortran readList) {
        this.readList = readList;
    }

    @Override
    public String toString() {
        return "READ " + readList.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
