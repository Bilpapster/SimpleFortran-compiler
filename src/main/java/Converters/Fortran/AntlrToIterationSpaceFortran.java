package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.IterationSpaceFortran;

public class AntlrToIterationSpaceFortran extends SimpleFortran2BaseVisitor<IterationSpaceFortran> {
    @Override
    public IterationSpaceFortran visitIterationSpace(SimpleFortran2Parser.IterationSpaceContext ctx) {
        IterationSpaceFortran iterationSpace = new IterationSpaceFortran();
        AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();

        iterationSpace.setExpressionLeft(expressionVisitor.visit(ctx.getChild(0)));    // expressionLeft
        iterationSpace.setExpressionRight(expressionVisitor.visit(ctx.getChild(2)));   // expressionRight
        iterationSpace.setStep(expressionVisitor.visit(ctx.step()));

        return iterationSpace;
    }
}
