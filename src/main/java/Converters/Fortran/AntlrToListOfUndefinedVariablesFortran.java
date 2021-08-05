package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.UndefinedVariableFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfUndefinedVariablesFortran extends SimpleFortran2BaseVisitor<List<UndefinedVariableFortran>> {
    private List<UndefinedVariableFortran> undefinedVariables = new ArrayList<>();
    private AntlrToUndefinedVariableFortran undefinedVariableVisitor = new AntlrToUndefinedVariableFortran();

    @Override
    public List<UndefinedVariableFortran> visitListOfUndefinedVariables(SimpleFortran2Parser.ListOfUndefinedVariablesContext ctx) {
        visit(ctx.variables()).add(undefinedVariableVisitor.visit(ctx.undefined_variable()));
        return undefinedVariables;
    }

    @Override
    public List<UndefinedVariableFortran> visitUndefinedVariablesEndCondition(SimpleFortran2Parser.UndefinedVariablesEndConditionContext ctx) {
        undefinedVariables.add(undefinedVariableVisitor.visit(ctx.undefined_variable()));
        return undefinedVariables;
    }
}
