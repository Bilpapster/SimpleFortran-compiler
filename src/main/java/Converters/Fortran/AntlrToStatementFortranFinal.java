package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.StatementFortran;

public class AntlrToStatementFortranFinal extends SimpleFortran2BaseVisitor<StatementFortran> {
    @Override
    public StatementFortran visitSimpleStatement(SimpleFortran2Parser.SimpleStatementContext ctx) {
        return new AntlrToSimpleStatementFortran().visit(ctx);
    }

    @Override
    public StatementFortran visitCompoundStatement(SimpleFortran2Parser.CompoundStatementContext ctx) {
        return new AntlrToCompoundStatementFortran().visit(ctx);
    }
}
