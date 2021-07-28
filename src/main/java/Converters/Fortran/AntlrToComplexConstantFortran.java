package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ComplexConstantFortran;

public class AntlrToComplexConstantFortran extends SimpleFortran2BaseVisitor<ComplexConstantFortran> {

    @Override
    public ComplexConstantFortran visitComplex_constant(SimpleFortran2Parser.Complex_constantContext ctx) {
        ComplexConstantFortran complexConstant = new ComplexConstantFortran();
        AntlrToFloatConstantFortran floatConstantVisitor = new AntlrToFloatConstantFortran();

        complexConstant.setLeft(floatConstantVisitor.visit(ctx.float_constant(0)));
        complexConstant.setRightPartSign(ctx.sign().getText());
        complexConstant.setRight(floatConstantVisitor.visit(ctx.float_constant(1)));

        return complexConstant;
    }
}
