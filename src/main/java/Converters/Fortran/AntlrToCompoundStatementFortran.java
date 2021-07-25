package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.CompoundStatementFortran;

public class AntlrToCompoundStatementFortran extends SimpleFortran2BaseVisitor<CompoundStatementFortran> {
    @Override
    public CompoundStatementFortran visitBranchStatement(SimpleFortran2Parser.BranchStatementContext ctx) {
        return new AntlrToBranchStatementFortran().visit(ctx);
    }

    @Override
    public CompoundStatementFortran visitLoopStatement(SimpleFortran2Parser.LoopStatementContext ctx) {
        return new AntlrToLoopStatementFortran().visit(ctx);
    }
}
