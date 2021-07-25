package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.WriteListFortran;

public class AntlrToWriteListFortran extends SimpleFortran2BaseVisitor<WriteListFortran> {
    WriteListFortran writeList = new WriteListFortran();
    AntlrToWriteItem writeItemVisitor = new AntlrToWriteItem();

    @Override
    public WriteListFortran visitListOfWriteItems(SimpleFortran2Parser.ListOfWriteItemsContext ctx) {
        visit(ctx.write_list());
        writeList.addWriteItem(writeItemVisitor.visit(ctx.write_item()));
        return writeList;
    }

    @Override
    public WriteListFortran visitWriteItemEndCondition(SimpleFortran2Parser.WriteItemEndConditionContext ctx) {
        writeList.addWriteItem(writeItemVisitor.visit(ctx.write_item()));
        return writeList;
    }
}
