package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.LabeledStatementFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfLabeledStatementsFortran extends SimpleFortran2BaseVisitor<List<LabeledStatementFortran>> {
    private final List<LabeledStatementFortran> statements = new ArrayList<>();
    private final AntlrToLabeledStatementFortranFinal statementInterfaceVisitor = new AntlrToLabeledStatementFortranFinal();

    @Override
    public List<LabeledStatementFortran> visitListOfLabeledStatements(SimpleFortran2Parser.ListOfLabeledStatementsContext ctx) {
        visit(ctx.statements());
        statements.add(statementInterfaceVisitor.visit(ctx.labeled_statement()));
        return statements;
    }

    @Override
    public List<LabeledStatementFortran> visitLabeledStatementEndCondition(SimpleFortran2Parser.LabeledStatementEndConditionContext ctx) {
        statements.add(statementInterfaceVisitor.visit(ctx.labeled_statement()));
        return statements;
    }
}
