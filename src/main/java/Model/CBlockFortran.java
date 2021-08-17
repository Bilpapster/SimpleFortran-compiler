package Model;

import java.util.List;

public class CBlockFortran {
    private String name;
    private List<String> identifiers;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder("/ " + name + identifiers.get(0));

        for (int index = 1; index < identifiers.size(); index++) {
            stringRepresentation.append(", ").append(identifiers.get(index));
        }

        return stringRepresentation.toString();
    }
}
