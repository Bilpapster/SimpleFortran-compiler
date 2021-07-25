package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ExpressionFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfExpressions extends SimpleFortran2BaseVisitor<List<ExpressionFortran>> {
    private AntlrToExpressionFortran expressionVisitor = new AntlrToExpressionFortran();
    private List<ExpressionFortran> expressions = new ArrayList<>();

    @Override
    public List<ExpressionFortran> visitListOfExpressions(SimpleFortran2Parser.ListOfExpressionsContext ctx) {
        visit(ctx.expressions());
        expressions.add(expressionVisitor.visit(ctx.expression()));
        return expressions;
    }

    @Override
    public List<ExpressionFortran> visitExpressionEndCondition(SimpleFortran2Parser.ExpressionEndConditionContext ctx) {
        expressions.add(expressionVisitor.visit(ctx.expression()));
        return expressions;
    }
}
