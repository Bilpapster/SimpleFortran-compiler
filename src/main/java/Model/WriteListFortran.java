package Model;

import java.util.List;
import java.util.ArrayList;

public class WriteListFortran extends ASTNodeFortran {
    private List<WriteItemFortran> writeItems = new ArrayList<>();

    public void addWriteItem(WriteItemFortran writeItem) {
        this.writeItems.add(writeItem);
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder(writeItems.get(0).toString());

        for (int index = 1; index < writeItems.size(); index++) {
            stringRepresentation.append(", ").append(writeItems.get(index));
        }

        return stringRepresentation.toString();
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
