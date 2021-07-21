package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ProgramFortran;

public class AntlrToProgramFortran extends SimpleFortran2BaseVisitor<ProgramFortran> {
    @Override
    public ProgramFortran visitProgram(SimpleFortran2Parser.ProgramContext ctx) {
        ProgramFortran program = new ProgramFortran();

        AntlrToBodyFortran bodyVisitor = new AntlrToBodyFortran();
        program.setBody(bodyVisitor.visit(ctx.body()));

        AntlrToListOfSubprograms subprogramsVisitor = new AntlrToListOfSubprograms();
        program.setSubprograms(subprogramsVisitor.visit(ctx.subprograms()));

        return program;
    }
}
