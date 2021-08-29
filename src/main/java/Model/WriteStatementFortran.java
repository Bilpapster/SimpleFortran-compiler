package Model;

public class WriteStatementFortran extends IOStatementFortran {
    private WriteListFortran writeList;

    public void setWriteList(WriteListFortran writeList) {
        this.writeList = writeList;
    }

    @Override
    public String toString() {
        return "WRITE " + writeList.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
