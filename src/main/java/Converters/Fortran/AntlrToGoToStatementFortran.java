package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.GoToStatementFortran;
import Model.MultipleGoToStatementFortran;
import Model.NormalGoToStatementFortran;

public class AntlrToGoToStatementFortran extends SimpleFortran2BaseVisitor<GoToStatementFortran> {
    @Override
    public GoToStatementFortran visitNormalGoToStatement(SimpleFortran2Parser.NormalGoToStatementContext ctx) {
        NormalGoToStatementFortran normalGoToStatement = new NormalGoToStatementFortran();

        AntlrToIntegerConstantFortran integerConstantVisitor = new AntlrToIntegerConstantFortran();
        normalGoToStatement.setLabel(integerConstantVisitor.visit(ctx.label()));

        return normalGoToStatement;
    }

    @Override
    public GoToStatementFortran visitMultipleGoToStatement(SimpleFortran2Parser.MultipleGoToStatementContext ctx) {
        MultipleGoToStatementFortran multipleGoToStatement = new MultipleGoToStatementFortran();

        multipleGoToStatement.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToListOfIntegerConstantsFortran labelsVisitor = new AntlrToListOfIntegerConstantsFortran();
        multipleGoToStatement.setLabels(labelsVisitor.visit(ctx.labels()));

        return multipleGoToStatement;
    }
}
