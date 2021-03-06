package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.SubprogramFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfSubprograms extends SimpleFortran2BaseVisitor<List<SubprogramFortran>> {

    private final AntlrToSubprogramFortran subprogramVisitor = new AntlrToSubprogramFortran();
    private final List<SubprogramFortran> subprograms = new ArrayList<>();

    @Override
    public List<SubprogramFortran> visitListOfSubprograms(SimpleFortran2Parser.ListOfSubprogramsContext ctx) {
        visit(ctx.subprograms()).add(subprogramVisitor.visit(ctx.subprogram()));
        return subprograms;
    }

    @Override
    public List<SubprogramFortran> visitSubprogramEndCondition(SimpleFortran2Parser.SubprogramEndConditionContext ctx) {
        return subprograms;
    }
}
