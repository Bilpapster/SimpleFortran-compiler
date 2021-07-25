package Model;

import java.util.List;
import java.util.ArrayList;

public class WriteListFortran {
    private List<WriteItemFortran> writeItems = new ArrayList<>();

    public void addWriteItem(WriteItemFortran writeItem) {
        this.writeItems.add(writeItem);
    }
}
