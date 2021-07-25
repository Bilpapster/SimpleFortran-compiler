package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ImplicitLoopReadItemFortran;
import Model.ReadItemFortran;
import Model.VariableReadItemFortran;

public class AntlrToReadItemFortran extends SimpleFortran2BaseVisitor<ReadItemFortran> {
    @Override
    public ReadItemFortran visitVariableReadItem(SimpleFortran2Parser.VariableReadItemContext ctx) {
        VariableReadItemFortran variableReadItem = new VariableReadItemFortran();

        AntlrToVariableFortran variableVisitor = new AntlrToVariableFortran();
        variableReadItem.setVariable(variableVisitor.visit(ctx.variable()));

        return variableReadItem;
    }

    @Override
    public ReadItemFortran visitImplicitLoopReadItem(SimpleFortran2Parser.ImplicitLoopReadItemContext ctx) {
        ImplicitLoopReadItemFortran implicitLoopReadItem = new ImplicitLoopReadItemFortran();

        AntlrToReadListFortran readListVisitor = new AntlrToReadListFortran();
        implicitLoopReadItem.setReadList(readListVisitor.visit(ctx.read_list()));

        implicitLoopReadItem.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToIterationSpaceFortran iterationSpaceVisitor = new AntlrToIterationSpaceFortran();
        implicitLoopReadItem.setIterationSpace(iterationSpaceVisitor.visit(ctx.iter_space()));

        return implicitLoopReadItem;
    }
}
