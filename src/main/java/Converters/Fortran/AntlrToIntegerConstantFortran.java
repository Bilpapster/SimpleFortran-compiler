package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.IntegerConstantFortran;

public class AntlrToIntegerConstantFortran extends SimpleFortran2BaseVisitor<IntegerConstantFortran> {

    private static final int startingIndex = 2; // the index of the string that the actual number starts from (removing 0X, 0B, etc.)

    @Override
    public IntegerConstantFortran visitIntegerDecimalLabel(SimpleFortran2Parser.IntegerDecimalLabelContext ctx) {
        IntegerConstantFortran decimalLabel = new IntegerConstantFortran();
        decimalLabel.setActualValue(Integer.parseInt(ctx.getText(), 10));
        return decimalLabel;
    }

    @Override
    public IntegerConstantFortran visitIntegerHexadecimalLabel(SimpleFortran2Parser.IntegerHexadecimalLabelContext ctx) {
        IntegerConstantFortran hexadecimalLabel = new IntegerConstantFortran();
        hexadecimalLabel.setActualValue(Integer.parseInt(ctx.getText().substring(startingIndex), 16));
        return hexadecimalLabel;
    }

    @Override
    public IntegerConstantFortran visitIntegerOctalLabel(SimpleFortran2Parser.IntegerOctalLabelContext ctx) {
        IntegerConstantFortran octalLabel = new IntegerConstantFortran();
        octalLabel.setActualValue(Integer.parseInt(ctx.getText().substring(startingIndex), 8));
        return octalLabel;
    }

    @Override
    public IntegerConstantFortran visitIntegerBinaryLabel(SimpleFortran2Parser.IntegerBinaryLabelContext ctx) {
        IntegerConstantFortran binaryLabel = new IntegerConstantFortran();
        binaryLabel.setActualValue(Integer.parseInt(ctx.getText().substring(startingIndex), 2));
        return binaryLabel;
    }
}
