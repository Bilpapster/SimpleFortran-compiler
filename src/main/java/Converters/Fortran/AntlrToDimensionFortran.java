package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.DimensionFortran;
import Model.IntegerConstantFortran;

public class AntlrToDimensionFortran extends SimpleFortran2BaseVisitor<DimensionFortran> {
    @Override
    public DimensionFortran visitIntegerNumericalDimension(SimpleFortran2Parser.IntegerNumericalDimensionContext ctx) {
        DimensionFortran dimension = new DimensionFortran();

        AntlrToIntegerConstantFortran integerConstantVisitor = new AntlrToIntegerConstantFortran();
        IntegerConstantFortran dimensionConstant = integerConstantVisitor.visit(ctx.label());
        dimension.setDimensionSize(dimensionConstant.getActualValue());

        return dimension;
    }

    @Override
    public DimensionFortran visitIdentifierDimension(SimpleFortran2Parser.IdentifierDimensionContext ctx) {
        DimensionFortran dimension = new DimensionFortran();

        dimension.setDimensionSize(1);
        // todo deal with the case when an (already declared) id is used as dimension (symbol table)

        return dimension;
    }
}
