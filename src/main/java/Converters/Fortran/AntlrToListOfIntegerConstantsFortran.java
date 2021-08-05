package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2Parser;
import Model.IntegerConstantFortran;
import BaseClassesFortran.SimpleFortran2BaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfIntegerConstantsFortran extends SimpleFortran2BaseVisitor<List<IntegerConstantFortran>> {

    private final AntlrToIntegerConstantFortran integerConstantVisitor = new AntlrToIntegerConstantFortran();
    private final List<IntegerConstantFortran> labels = new ArrayList<>();

    @Override
    public List<IntegerConstantFortran> visitListOfLabels(SimpleFortran2Parser.ListOfLabelsContext ctx) {
        visit(ctx.labels()).add(integerConstantVisitor.visit(ctx.label()));
        return labels;
    }

    @Override
    public List<IntegerConstantFortran> visitLabelEndCondition(SimpleFortran2Parser.LabelEndConditionContext ctx) {
        labels.add(integerConstantVisitor.visit(ctx.label()));
        return labels;
    }
}
