package Model;

import java.util.List;

public class WriteStatementFortran extends IOStatementFortran{
    private WriteListFortran writeList;

    public void setWriteList(WriteListFortran writeList) {
        this.writeList = writeList;
    }
}
