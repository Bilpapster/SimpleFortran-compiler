package Model;

import java.util.List;

public class CommonDeclarationFortran implements DeclarationFortran{
    private List<CBlockFortran> cBlocks;

    public void setCBlocks(List<CBlockFortran> cBlocks) {
        this.cBlocks = cBlocks;
    }
}
