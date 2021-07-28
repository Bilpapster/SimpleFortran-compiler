package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfIdentifiersFortran extends SimpleFortran2BaseVisitor<List<String>> {
    private final List<String> identifiers = new ArrayList<>();

    @Override
    public List<String> visitListOfIdentifiers(SimpleFortran2Parser.ListOfIdentifiersContext ctx) {
        visit(ctx.identifier_list()).add(ctx.IDENTIFIER().getText());
        return identifiers;
    }

    @Override
    public List<String> visitIdentifierListEndCondition(SimpleFortran2Parser.IdentifierListEndConditionContext ctx) {
        identifiers.add(ctx.IDENTIFIER().getText());
        return identifiers;
    }

}
