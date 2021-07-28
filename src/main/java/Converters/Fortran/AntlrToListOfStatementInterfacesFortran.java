package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.StatementInterfaceFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfStatementInterfacesFortran extends SimpleFortran2BaseVisitor<List<StatementInterfaceFortran>> {
    private List<StatementInterfaceFortran> statements = new ArrayList<>();
    private final AntlrToStatementInterfaceFortran statementInterfaceVisitor = new AntlrToStatementInterfaceFortran();

    @Override
    public List<StatementInterfaceFortran> visitListOfLabeledStatements(SimpleFortran2Parser.ListOfLabeledStatementsContext ctx) {
        visit(ctx.statements());
        statements.add(statementInterfaceVisitor.visit(ctx.labeled_statement()));
        return statements;
    }

    @Override
    public List<StatementInterfaceFortran> visitLabeledStatementEndCondition(SimpleFortran2Parser.LabeledStatementEndConditionContext ctx) {
        statements.add(statementInterfaceVisitor.visit(ctx.labeled_statement()));
        return statements;
    }
}
