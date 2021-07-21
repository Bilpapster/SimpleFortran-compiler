package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.TailFortran;

public class AntlrToTailFortran extends SimpleFortran2BaseVisitor<TailFortran> {
    @Override
    public TailFortran visitElseTail(SimpleFortran2Parser.ElseTailContext ctx) {
        TailFortran elseTail = new TailFortran();

        AntlrToBodyFortran bodyVisitor = new AntlrToBodyFortran();
        elseTail.setBody(bodyVisitor.visit(ctx.body()));

        return elseTail;
    }

    @Override
    public TailFortran visitNoTail(SimpleFortran2Parser.NoTailContext ctx) {
        return new TailFortran();
    }
}
