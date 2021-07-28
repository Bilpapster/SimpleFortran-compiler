package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.CBlockFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfCBlocksFortran extends SimpleFortran2BaseVisitor<List<CBlockFortran>> {
    private final List<CBlockFortran> cBlocks = new ArrayList<>();
    private final AntlrToCBlockFortran cBlockVisitor = new AntlrToCBlockFortran();

    @Override
    public List<CBlockFortran> visitListOfCBlocks(SimpleFortran2Parser.ListOfCBlocksContext ctx) {
        visit(ctx.cblock_list()).add(cBlockVisitor.visit(ctx.cblock()));
        return cBlocks;
    }

    @Override
    public List<CBlockFortran> visitCBlockEndCondition(SimpleFortran2Parser.CBlockEndConditionContext ctx) {
        cBlocks.add(cBlockVisitor.visit(ctx.cblock()));
        return cBlocks;
    }
}
