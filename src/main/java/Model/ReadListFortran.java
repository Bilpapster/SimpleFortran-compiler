package Model;

import java.util.ArrayList;
import java.util.List;

public class ReadListFortran extends ASTNodeFortran {
    private List<ReadItemFortran> readItems = new ArrayList<>();

    public void addReadItem(ReadItemFortran readItem) {
        this.readItems.add(readItem);
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(readItems.get(0).toString());

        for (int index = 1; index < readItems.size(); index++) {
            stringRepresentation.append(", ").append(readItems.get(index));
        }

        return stringRepresentation.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
