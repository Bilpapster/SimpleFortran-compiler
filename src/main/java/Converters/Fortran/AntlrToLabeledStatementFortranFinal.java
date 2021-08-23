package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.LabeledStatementFortran;

public class AntlrToLabeledStatementFortranFinal extends SimpleFortran2BaseVisitor<LabeledStatementFortran> {

    private final AntlrToStatementFortranFinal statementVisitor = new AntlrToStatementFortranFinal();

    @Override
    public LabeledStatementFortran visitLabeledStatement(SimpleFortran2Parser.LabeledStatementContext ctx) {
        LabeledStatementFortran labeledStatement = new LabeledStatementFortran();

        AntlrToIntegerConstantFortran labelVisitor = new AntlrToIntegerConstantFortran();
        labeledStatement.setLabel(labelVisitor.visit(ctx.label()));

        labeledStatement.setStatement(statementVisitor.visit(ctx.statement()));

        return labeledStatement;
    }

    @Override
    public LabeledStatementFortran visitNormalStatement(SimpleFortran2Parser.NormalStatementContext ctx) {
        LabeledStatementFortran labeledStatement = new LabeledStatementFortran();
        labeledStatement.setStatement(statementVisitor.visit(ctx.statement()));
        return labeledStatement;
    }
}
