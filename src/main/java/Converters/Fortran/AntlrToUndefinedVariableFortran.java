package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ArrayUndefinedVariableFortran;
import Model.NormalUndefinedVariableFortran;
import Model.UndefinedVariableFortran;

public class AntlrToUndefinedVariableFortran extends SimpleFortran2BaseVisitor<UndefinedVariableFortran> {

    @Override
    public UndefinedVariableFortran visitArrayUndefinedVariable(SimpleFortran2Parser.ArrayUndefinedVariableContext ctx) {
        ArrayUndefinedVariableFortran listUndefinedVariable = new ArrayUndefinedVariableFortran();

        AntlrToBooleanFortran listSpecificationVisitor = new AntlrToBooleanFortran();
        listUndefinedVariable.setIsList(listSpecificationVisitor.visit(ctx.listspec()));


        listUndefinedVariable.setName(ctx.IDENTIFIER().getText());

        AntlrToListOfDimensionsFortran dimensionsVisitor = new AntlrToListOfDimensionsFortran();
        listUndefinedVariable.setDimensions(dimensionsVisitor.visit(ctx.dims()));

        return listUndefinedVariable;
    }

    @Override
    public UndefinedVariableFortran visitNormalUndefinedVariable(SimpleFortran2Parser.NormalUndefinedVariableContext ctx) {
        NormalUndefinedVariableFortran normalUndefinedVariable = new NormalUndefinedVariableFortran();

        AntlrToBooleanFortran listSpecificationVisitor = new AntlrToBooleanFortran();
        normalUndefinedVariable.setIsList(listSpecificationVisitor.visit(ctx.listspec()));

        normalUndefinedVariable.setName(ctx.IDENTIFIER().getText());

        return normalUndefinedVariable;
    }
}
