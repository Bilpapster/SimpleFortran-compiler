package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.SubroutineCallStatementFortran;

public class AntlrToSubroutineCallStatementFortran extends SimpleFortran2BaseVisitor<SubroutineCallStatementFortran> {
    @Override
    public SubroutineCallStatementFortran visitSubroutineCall(SimpleFortran2Parser.SubroutineCallContext ctx) {
        AntlrToVariableFortran variableVisitor = new AntlrToVariableFortran();
        SubroutineCallStatementFortran subroutineCallStatement = new SubroutineCallStatementFortran();
        subroutineCallStatement.setVariable(variableVisitor.visit(ctx.variable()));
        return subroutineCallStatement;
    }
}
