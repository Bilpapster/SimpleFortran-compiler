package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.LoopStatementFortran;

public class AntlrToLoopStatementFortran extends SimpleFortran2BaseVisitor<LoopStatementFortran> {
    @Override
    public LoopStatementFortran visitLoop_statement(SimpleFortran2Parser.Loop_statementContext ctx) {
        LoopStatementFortran loopStatement = new LoopStatementFortran();

        loopStatement.setIdentifier(ctx.IDENTIFIER().getText());

        AntlrToIterationSpaceFortran iterationSpaceVisitor = new AntlrToIterationSpaceFortran();
        loopStatement.setIterationSpace(iterationSpaceVisitor.visit(ctx.iter_space()));

        AntlrToBodyFortran bodyVisitor = new AntlrToBodyFortran();
        loopStatement.setBody(bodyVisitor.visit(ctx.body()));

        return loopStatement;
    }
}
