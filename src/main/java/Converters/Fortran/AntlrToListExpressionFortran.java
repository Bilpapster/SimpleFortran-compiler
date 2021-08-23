package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ListOperationFortran;

import java.util.ArrayList;

public class AntlrToListExpressionFortran extends SimpleFortran2BaseVisitor<ListOperationFortran> {

    @Override
    public ListOperationFortran visitListExpressionTest(SimpleFortran2Parser.ListExpressionTestContext ctx) {
        ListOperationFortran listOperation = new ListOperationFortran();

        AntlrToListOfExpressions expressionsVisitor = new AntlrToListOfExpressions();
        listOperation.setExpressions(expressionsVisitor.visit(ctx.expressions()));

        return listOperation;
    }

    @Override
    public ListOperationFortran visitEmptyListExpression(SimpleFortran2Parser.EmptyListExpressionContext ctx) {
        ListOperationFortran emptyListOperation = new ListOperationFortran();
        emptyListOperation.setExpressions(new ArrayList<>());
        return emptyListOperation;
    }
}
