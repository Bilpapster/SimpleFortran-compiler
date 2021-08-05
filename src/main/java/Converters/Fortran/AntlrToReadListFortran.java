package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ReadListFortran;

public class AntlrToReadListFortran extends SimpleFortran2BaseVisitor<ReadListFortran> {
    private final ReadListFortran readListFortran = new ReadListFortran();
    private final AntlrToReadItemFortran readItemVisitor = new AntlrToReadItemFortran();

    @Override
    public ReadListFortran visitListOfReadItems(SimpleFortran2Parser.ListOfReadItemsContext ctx) {
        visit(ctx.read_item());
        readListFortran.addReadItem(readItemVisitor.visit(ctx.read_item()));
        return readListFortran;
    }

    @Override
    public ReadListFortran visitReadItemEndCondition(SimpleFortran2Parser.ReadItemEndConditionContext ctx) {
        readListFortran.addReadItem(readItemVisitor.visit(ctx.read_item()));
        return readListFortran;
    }
}
