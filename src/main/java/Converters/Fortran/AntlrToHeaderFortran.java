package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.HeaderFortran;
import Model.NormalFunctionHeaderFortran;
import Model.SubroutineHeaderFortran;

public class AntlrToHeaderFortran extends SimpleFortran2BaseVisitor<HeaderFortran> {
    @Override
    public HeaderFortran visitNormalFunctionHeader(SimpleFortran2Parser.NormalFunctionHeaderContext ctx) {
        NormalFunctionHeaderFortran functionHeader = new NormalFunctionHeaderFortran();

        AntlrToDataTypeFortran dataTypeVisitor = new AntlrToDataTypeFortran();
        AntlrToBooleanFortran listSpecificationVisitor = new AntlrToBooleanFortran();
        functionHeader.setDataType(dataTypeVisitor.visit(ctx.type()).setAsList(listSpecificationVisitor.visit(ctx.listspec())));

        functionHeader.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToListOfFormalParameters formalParametersVisitor = new AntlrToListOfFormalParameters();
        functionHeader.setFormalParameters(formalParametersVisitor.visit(ctx.formal_parameters()));

        return functionHeader;
    }

    @Override
    public HeaderFortran visitListSubroutineHeader(SimpleFortran2Parser.ListSubroutineHeaderContext ctx) {
        SubroutineHeaderFortran subroutineHeader = new SubroutineHeaderFortran();

        subroutineHeader.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToListOfFormalParameters formalParametersVisitor = new AntlrToListOfFormalParameters();
        subroutineHeader.setFormalParameters(formalParametersVisitor.visit(ctx.formal_parameters()));

        return subroutineHeader;
    }

    @Override
    public HeaderFortran visitNormalSubroutineHeader(SimpleFortran2Parser.NormalSubroutineHeaderContext ctx) {
        SubroutineHeaderFortran subroutineHeader = new SubroutineHeaderFortran();
        subroutineHeader.setIdentifier(ctx.IDENTIFIER().getText());
        return subroutineHeader;
    }
}
