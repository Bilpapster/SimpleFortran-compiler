package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ConstantFortran;

public class AntlrToConstantFortran extends SimpleFortran2BaseVisitor<ConstantFortran> {
    @Override
    public ConstantFortran visitSimpleConstant(SimpleFortran2Parser.SimpleConstantContext ctx) {
        return new AntlrToSimpleConstantFortran().visit(ctx);
    }

    @Override
    public ConstantFortran visitComplexConstant(SimpleFortran2Parser.ComplexConstantContext ctx) {
        return new AntlrToComplexConstantFortran().visit(ctx);
    }

}
