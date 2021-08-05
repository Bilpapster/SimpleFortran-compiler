package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2Parser;
import Model.*;
import BaseClassesFortran.SimpleFortran2BaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfDeclarations extends SimpleFortran2BaseVisitor<List<DeclarationFortran>> {

    private List<DeclarationFortran> declarations;

    @Override
    public List<DeclarationFortran> visitVariableDeclaration(SimpleFortran2Parser.VariableDeclarationContext ctx) {
        VariableDeclarationFortran undefinedVariableDeclaration = new VariableDeclarationFortran();

        AntlrToDataTypeFortran dataTypeVisitor = new AntlrToDataTypeFortran();
        undefinedVariableDeclaration.setDataType(dataTypeVisitor.visit(ctx.type()));

        AntlrToListOfUndefinedVariablesFortran undefinedVariablesVisitor = new AntlrToListOfUndefinedVariablesFortran();
        undefinedVariableDeclaration.setVariables(undefinedVariablesVisitor.visit(ctx.variables()));

        visit(ctx.declarations()).add(undefinedVariableDeclaration);
        return declarations;
    }

    @Override
    public List<DeclarationFortran> visitCommonDeclaration(SimpleFortran2Parser.CommonDeclarationContext ctx) {
        CommonDeclarationFortran commonDeclaration = new CommonDeclarationFortran();

        AntlrToListOfCBlocksFortran cBlocksVisitor = new AntlrToListOfCBlocksFortran();
        commonDeclaration.setCBlocks(cBlocksVisitor.visit(ctx.cblock_list()));

        visit(ctx.declarations()).add(commonDeclaration);
        return declarations;
    }

    @Override
    public List<DeclarationFortran> visitDataDeclaration(SimpleFortran2Parser.DataDeclarationContext ctx) {
        DataDeclarationFortran dataDeclaration = new DataDeclarationFortran();

        AntlrToListOfDataValuesFortran dataValuesVisitor = new AntlrToListOfDataValuesFortran();
        dataDeclaration.setDataValues(dataValuesVisitor.visit(ctx.vals()));

        visit(ctx.declarations()).add(dataDeclaration);
        return declarations;
    }

    @Override
    public List<DeclarationFortran> visitDeclarationsEndCondition(SimpleFortran2Parser.DeclarationsEndConditionContext ctx) {
        declarations = new ArrayList<>();
        return declarations;
    }

}
