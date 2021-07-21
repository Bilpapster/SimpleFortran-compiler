package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.SubprogramFortran;

public class AntlrToSubprogramFortran extends SimpleFortran2BaseVisitor<SubprogramFortran> {
    @Override
    public SubprogramFortran visitSubprogram(SimpleFortran2Parser.SubprogramContext ctx) {
        SubprogramFortran subprogram = new SubprogramFortran();

        AntlrToHeaderFortran headerVisitor = new AntlrToHeaderFortran();
        subprogram.setHeader(headerVisitor.visit(ctx.header()));

        AntlrToBodyFortran bodyVisitor = new AntlrToBodyFortran();
        subprogram.setBody(bodyVisitor.visit(ctx.body()));

        return subprogram;
    }
}
