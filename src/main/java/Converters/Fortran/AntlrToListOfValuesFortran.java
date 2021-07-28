package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ValueFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfValuesFortran extends SimpleFortran2BaseVisitor<List<ValueFortran>> {
    private final List<ValueFortran> values = new ArrayList<>();
    private final AntlrToValueFortran valueVisitor = new AntlrToValueFortran();

    @Override
    public List<ValueFortran> visitListOfDataValues(SimpleFortran2Parser.ListOfDataValuesContext ctx) {
        visit(ctx.values());
        values.add(valueVisitor.visit(ctx.value()));
        return values;
    }

    @Override
    public List<ValueFortran> visitDataValueEndCondition(SimpleFortran2Parser.DataValueEndConditionContext ctx) {
        values.add(valueVisitor.visit(ctx.value()));
        return values;
    }

    @Override
    public List<ValueFortran> visitValue_list(SimpleFortran2Parser.Value_listContext ctx) {
        return visit(ctx.values());
    }
}
