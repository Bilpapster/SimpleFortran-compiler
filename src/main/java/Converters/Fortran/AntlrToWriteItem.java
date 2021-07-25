package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ExpressionWriteItemFortran;
import Model.ImplicitLoopWriteItemFortran;
import Model.WriteItemFortran;

public class AntlrToWriteItem extends SimpleFortran2BaseVisitor<WriteItemFortran> {

    @Override
    public WriteItemFortran visitExpressionWriteItem(SimpleFortran2Parser.ExpressionWriteItemContext ctx) {
        ExpressionWriteItemFortran expressionWriteItem = new ExpressionWriteItemFortran();
        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
        expressionWriteItem.setExpression(expressionVisitor.visit(ctx.expression()));
        return expressionWriteItem;
    }

    @Override
    public WriteItemFortran visitImplicitLoopWriteItem(SimpleFortran2Parser.ImplicitLoopWriteItemContext ctx) {
        ImplicitLoopWriteItemFortran implicitLoopWriteItem = new ImplicitLoopWriteItemFortran();

        AntlrToWriteListFortran writeListVisitor = new AntlrToWriteListFortran();
        implicitLoopWriteItem.setWriteList(writeListVisitor.visit(ctx.write_list()));

        implicitLoopWriteItem.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToIterationSpaceFortran iterationSpaceVisitor = new AntlrToIterationSpaceFortran();
        implicitLoopWriteItem.setIterationSpace(iterationSpaceVisitor.visit(ctx.iter_space()));

        return implicitLoopWriteItem;
    }
}
