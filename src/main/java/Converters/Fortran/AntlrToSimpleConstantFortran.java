package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.CharacterConstantFortran;
import Model.LogicalConstantFortran;
import Model.SimpleConstantFortran;
import Model.StringConstantFortran;

public class AntlrToSimpleConstantFortran extends SimpleFortran2BaseVisitor<SimpleConstantFortran> {
    @Override
    public SimpleConstantFortran visitIntegerSimpleConstant(SimpleFortran2Parser.IntegerSimpleConstantContext ctx) {
        return new AntlrToSimpleConstantFortran().visit(ctx);
    }

    @Override
    public SimpleConstantFortran visitFloatSimpleConstant(SimpleFortran2Parser.FloatSimpleConstantContext ctx) {
        return new AntlrToFloatConstantFortran().visit(ctx);
    }

    @Override
    public SimpleConstantFortran visitTrueKeywordConstant(SimpleFortran2Parser.TrueKeywordConstantContext ctx) {
        return new LogicalConstantFortran(true);
    }

    @Override
    public SimpleConstantFortran visitFalseKeywordConstant(SimpleFortran2Parser.FalseKeywordConstantContext ctx) {
        return new LogicalConstantFortran(false);
    }

    @Override
    public SimpleConstantFortran visitCharacterConstant(SimpleFortran2Parser.CharacterConstantContext ctx) {
        return new CharacterConstantFortran(ctx.CCONST().getText().charAt(1));
    }

    @Override
    public SimpleConstantFortran visitStringConstant(SimpleFortran2Parser.StringConstantContext ctx) {
        // todo deal with the regex and the multiline strings
        return new StringConstantFortran(ctx.SCONST().getText());
    }
}
