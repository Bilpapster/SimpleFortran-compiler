package Model;

import java.util.ArrayList;
import java.util.List;

public class ReadListFortran {
    private List<ReadItemFortran> readItems = new ArrayList<>();

    public void addReadItem(ReadItemFortran readItem) {
        this.readItems.add(readItem);
    }
}
