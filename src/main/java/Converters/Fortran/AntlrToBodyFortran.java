package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.BodyFortran;

public class AntlrToBodyFortran extends SimpleFortran2BaseVisitor<BodyFortran> {
    @Override
    public BodyFortran visitBody(SimpleFortran2Parser.BodyContext ctx) {
        BodyFortran body = new BodyFortran();

        AntlrToListOfDeclarations declarationsVisitor = new AntlrToListOfDeclarations();
        body.setDeclarations(declarationsVisitor.visit(ctx.declarations()));

        AntlrToListOfLabeledStatementsFortran statementsVisitor = new AntlrToListOfLabeledStatementsFortran();
        body.setStatements(statementsVisitor.visit(ctx.statements()));

        return body;
    }
}
