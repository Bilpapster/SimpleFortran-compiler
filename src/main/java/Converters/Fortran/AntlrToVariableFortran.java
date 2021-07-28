package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.IdentifierVariableFortran;
import Model.ListFunctionVariableFortran;
import Model.ListVariableFortran;
import Model.VariableFortran;

public class AntlrToVariableFortran extends SimpleFortran2BaseVisitor<VariableFortran> {
    @Override
    public VariableFortran visitListVariable(SimpleFortran2Parser.ListVariableContext ctx) {
        ListVariableFortran listVariable = new ListVariableFortran();

        listVariable.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToListOfExpressions expressionsVisitor = new AntlrToListOfExpressions();
        listVariable.setExpressions(expressionsVisitor.visit(ctx.expressions()));

        return listVariable;
    }

    @Override
    public VariableFortran visitListFunctionVariable(SimpleFortran2Parser.ListFunctionVariableContext ctx) {
        ListFunctionVariableFortran listFunctionVariable = new ListFunctionVariableFortran();

        listFunctionVariable.setListFunction(ctx.LISTFUNC().getText());

        AntlrToListOfExpressions expressionVisitor = new AntlrToListOfExpressions();
        listFunctionVariable.setExpressions(expressionVisitor.visit(ctx.expression()));

        return listFunctionVariable;
    }

    @Override
    public VariableFortran visitIdentifierVariable(SimpleFortran2Parser.IdentifierVariableContext ctx) {
        IdentifierVariableFortran identifierVariable = new IdentifierVariableFortran();
        identifierVariable.setIdentifier(ctx.IDENTIFIER().getText());
        return identifierVariable;
    }
}
