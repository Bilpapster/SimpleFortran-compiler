package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.LabeledStatementFortran;
import Model.NormalStatementFortran;
import Model.StatementInterfaceFortran;

public class AntlrToStatementInterfaceFortran extends SimpleFortran2BaseVisitor<StatementInterfaceFortran> {
    @Override
    public StatementInterfaceFortran visitLabeledStatement(SimpleFortran2Parser.LabeledStatementContext ctx) {
        LabeledStatementFortran labeledStatement = new LabeledStatementFortran();

        AntlrToIntegerConstantFortran labelVisitor = new AntlrToIntegerConstantFortran();
        labeledStatement.setLabel(labelVisitor.visit(ctx.label()));

        AntlrToStatementFortran statementVisitor = new AntlrToStatementFortran();
        labeledStatement.setStatement(statementVisitor.visit(ctx.statement()));

        return labeledStatement;
    }

    @Override
    public StatementInterfaceFortran visitNormalStatement123456789(SimpleFortran2Parser.NormalStatement123456789Context ctx) {
        NormalStatementFortran normalStatement = new NormalStatementFortran();

        AntlrToStatementFortran statementVisitor = new AntlrToStatementFortran();
        normalStatement.setStatement(statementVisitor.visit(ctx.statement()));

        return normalStatement;
    }
}
