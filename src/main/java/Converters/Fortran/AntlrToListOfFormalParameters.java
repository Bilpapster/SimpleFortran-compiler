package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.FormalParameterFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfFormalParameters extends SimpleFortran2BaseVisitor<List<FormalParameterFortran>> {
    private final List<FormalParameterFortran> formalParameters = new ArrayList<>();
    private final AntlrToDataTypeFortran dataTypeVisitor = new AntlrToDataTypeFortran();
    private final AntlrToListOfUndefinedVariablesFortran undefinedVariablesVisitor = new AntlrToListOfUndefinedVariablesFortran();


    @Override
    public List<FormalParameterFortran> visitListOfFormalParameters(SimpleFortran2Parser.ListOfFormalParametersContext ctx) {

        FormalParameterFortran formalParameter = new FormalParameterFortran();
        formalParameter.setDataType(dataTypeVisitor.visit(ctx.type()));
        formalParameter.setVariables(undefinedVariablesVisitor.visit(ctx.variables()));

        formalParameters.add(formalParameter);
        visit(ctx.formal_parameters());

        return formalParameters;
    }

    @Override
    public List<FormalParameterFortran> visitFormalParametersEndCondition(SimpleFortran2Parser.FormalParametersEndConditionContext ctx) {

        FormalParameterFortran formalParameter = new FormalParameterFortran();
        formalParameter.setDataType(dataTypeVisitor.visit(ctx.type()));
        formalParameter.setVariables(undefinedVariablesVisitor.visit(ctx.variables()));

        formalParameters.add(formalParameter);

        return formalParameters;
    }

}
