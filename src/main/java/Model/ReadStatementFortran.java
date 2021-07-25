package Model;

import java.util.List;

public class ReadStatementFortran extends IOStatementFortran{
    private ReadListFortran readList;

    public void setReadList(ReadListFortran readList) {
        this.readList = readList;
    }
}
