package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.NormalValueFortran;
import Model.RepeatValueFortran;
import Model.ValueFortran;

public class AntlrToValueFortran extends SimpleFortran2BaseVisitor<ValueFortran> {
    @Override
    public ValueFortran visitRepeatValue(SimpleFortran2Parser.RepeatValueContext ctx) {
        RepeatValueFortran repeatValue = new RepeatValueFortran();

        AntlrToRepeatFortran repeatVisitor = new AntlrToRepeatFortran();
        repeatValue.setRepeat(repeatVisitor.visit(ctx.repeat()));

        repeatValue.setSign(ctx.sign().getText());

        AntlrToConstantFortran constantVisitor = new AntlrToConstantFortran();
        repeatValue.setConstant(constantVisitor.visit(ctx.constant()));

        return repeatValue;
    }

    @Override
    public ValueFortran visitSignedValueConstant(SimpleFortran2Parser.SignedValueConstantContext ctx) {
        NormalValueFortran normalValue = new NormalValueFortran();

        AntlrToConstantFortran constantVisitor = new AntlrToConstantFortran();
        normalValue.setConstant(constantVisitor.visit(ctx.constant()));

        return normalValue;
    }

    @Override
    public ValueFortran visitNormalValueConstant(SimpleFortran2Parser.NormalValueConstantContext ctx) {
        NormalValueFortran normalValue = new NormalValueFortran();

        AntlrToConstantFortran constantVisitor = new AntlrToConstantFortran();
        normalValue.setConstant(constantVisitor.visit(ctx.constant()));

        return normalValue;
    }
}
