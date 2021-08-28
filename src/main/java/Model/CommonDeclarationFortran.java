package Model;

import java.util.List;

public class CommonDeclarationFortran extends DeclarationFortran {
    private List<CBlockFortran> cBlocks;

    public void setCBlocks(List<CBlockFortran> cBlocks) {
        this.cBlocks = cBlocks;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder("COMMON " + cBlocks.get(0));

        for (int index = 1; index < cBlocks.size(); index++) {
            stringRepresentation.append('\n').append(cBlocks.get(index));
        }

        return stringRepresentation.append('\n').toString();
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
