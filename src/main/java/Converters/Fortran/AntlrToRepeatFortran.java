package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.RepeatFortran;

public class AntlrToRepeatFortran extends SimpleFortran2BaseVisitor<RepeatFortran> {
    @Override
    public RepeatFortran visitIntegerConstantRepeat(SimpleFortran2Parser.IntegerConstantRepeatContext ctx) {
        RepeatFortran integerConstantRepeat = new RepeatFortran();

        AntlrToIntegerConstantFortran integerConstantVisitor = new AntlrToIntegerConstantFortran();
        integerConstantRepeat.setIntegerConstant(integerConstantVisitor.visit(ctx.label()));

        return integerConstantRepeat;
    }

    @Override
    public RepeatFortran visitNoConstantRepeat(SimpleFortran2Parser.NoConstantRepeatContext ctx) {
        return new RepeatFortran();
    }
}
