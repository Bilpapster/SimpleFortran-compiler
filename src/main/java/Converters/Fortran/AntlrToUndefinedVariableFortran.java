package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ListUndefinedVariableFortran;
import Model.NormalUndefinedVariableFortran;
import Model.UndefinedVariableFortran;

public class AntlrToUndefinedVariableFortran extends SimpleFortran2BaseVisitor<UndefinedVariableFortran> {

    @Override
    public UndefinedVariableFortran visitListUndefinedVariable(SimpleFortran2Parser.ListUndefinedVariableContext ctx) {
        ListUndefinedVariableFortran listUndefinedVariable = new ListUndefinedVariableFortran();

        listUndefinedVariable.setName(ctx.IDENTIFIER().getText());

        AntlrToListOfDimensionsFortran dimensionsVisitor = new AntlrToListOfDimensionsFortran();
        listUndefinedVariable.setDimensions(dimensionsVisitor.visit(ctx.dims()));

        return listUndefinedVariable;
    }

    @Override
    public UndefinedVariableFortran visitNormalUndefinedVariable(SimpleFortran2Parser.NormalUndefinedVariableContext ctx) {
        NormalUndefinedVariableFortran normalUndefinedVariable = new NormalUndefinedVariableFortran();
        normalUndefinedVariable.setName(ctx.IDENTIFIER().getText());
        return normalUndefinedVariable;
    }
}
