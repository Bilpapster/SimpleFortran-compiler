package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.DimensionFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfDimensionsFortran extends SimpleFortran2BaseVisitor<List<DimensionFortran>> {
    private List<DimensionFortran> dimensions = new ArrayList<>();
    private AntlrToDimensionFortran dimensionVisitor = new AntlrToDimensionFortran();

    @Override
    public List<DimensionFortran> visitListOfDimensions(SimpleFortran2Parser.ListOfDimensionsContext ctx) {
        visit(ctx.dims()).add(dimensionVisitor.visit(ctx.dim()));
        return dimensions;
    }

    @Override
    public List<DimensionFortran> visitDimensionsEndCondition(SimpleFortran2Parser.DimensionsEndConditionContext ctx) {
        dimensions.add(dimensionVisitor.visit(ctx.dim()));
        return dimensions;
    }
}
