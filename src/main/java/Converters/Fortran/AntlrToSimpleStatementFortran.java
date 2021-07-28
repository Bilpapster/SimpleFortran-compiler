package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.ContinueStatementFortran;
import Model.ReturnStatementFortran;
import Model.StopStatementFortran;
import Model.SimpleStatementFortran;

public class AntlrToSimpleStatementFortran extends SimpleFortran2BaseVisitor<SimpleStatementFortran> {
    @Override
    public SimpleStatementFortran visitAssignmentStatement(SimpleFortran2Parser.AssignmentStatementContext ctx) {
        return new AntlrToAssignmentStatementFortran().visit(ctx);
    }

    @Override
    public SimpleStatementFortran visitGoToStatement(SimpleFortran2Parser.GoToStatementContext ctx) {
        return new AntlrToGoToStatementFortran().visit(ctx);
    }

    @Override
    public SimpleStatementFortran visitIfStatement(SimpleFortran2Parser.IfStatementContext ctx) {
        return new AntlrToIfStatementFortran().visit(ctx);
    }

    @Override
    public SimpleStatementFortran visitSubroutineStatement(SimpleFortran2Parser.SubroutineStatementContext ctx) {
        return new AntlrToSubroutineCallStatementFortran().visit(ctx);
    }

    @Override
    public SimpleStatementFortran visitIOStatement(SimpleFortran2Parser.IOStatementContext ctx) {
        return new AntlrToIOStatementFortran().visit(ctx);
    }

    @Override
    public SimpleStatementFortran visitContinueStatement(SimpleFortran2Parser.ContinueStatementContext ctx) {
        return new ContinueStatementFortran();
    }

    @Override
    public SimpleStatementFortran visitReturnStatement(SimpleFortran2Parser.ReturnStatementContext ctx) {
        return new ReturnStatementFortran();
    }

    @Override
    public SimpleStatementFortran visitStopStatement(SimpleFortran2Parser.StopStatementContext ctx) {
        return new StopStatementFortran();
    }
}
