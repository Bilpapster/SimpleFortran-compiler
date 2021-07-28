package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.CBlockFortran;

public class AntlrToCBlockFortran extends SimpleFortran2BaseVisitor<CBlockFortran> {
    @Override
    public CBlockFortran visitCblock(SimpleFortran2Parser.CblockContext ctx) {
        CBlockFortran cBlock = new CBlockFortran();

        cBlock.setName(ctx.IDENTIFIER().getText());

        AntlrToListOfIdentifiersFortran identifiersVisitor = new AntlrToListOfIdentifiersFortran();
        cBlock.setIdentifiers(identifiersVisitor.visit(ctx.identifier_list()));

        return cBlock;
    }
}
