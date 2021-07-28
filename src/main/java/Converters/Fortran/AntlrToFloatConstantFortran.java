package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.FloatConstantFortran;

public class AntlrToFloatConstantFortran extends SimpleFortran2BaseVisitor<FloatConstantFortran> {

    private static final int startingIndex = 2; // the index of the string that the actual number starts from (removing 0X, 0B, etc.)


    private float convertFromRadixToDecimal(String numberRepresentation, int radix) {
        String[] numberParts = numberRepresentation.split("\\.");
        int integerPart = (numberParts[0].length() == 0) ? 0 : Integer.parseInt(numberParts[0].substring(startingIndex), radix);

        if (numberParts.length == 1) {
            return (float) integerPart;
        }

        float decimalPart = 0f;

        float factor = (float) 1 / radix;
        for (int digitPosition = 0; digitPosition < numberParts[1].length(); digitPosition++) {
            int digit = Integer.parseInt(Character.toString(numberParts[1].charAt(digitPosition)), radix);
            decimalPart += digit * factor;
            factor /= radix;
        }

        return (float) integerPart + decimalPart;
    }

    @Override
    public FloatConstantFortran visitFloatDecimalConstant(SimpleFortran2Parser.FloatDecimalConstantContext ctx) {
        FloatConstantFortran decimalFloatConstant = new FloatConstantFortran();
        decimalFloatConstant.setActualValue(Float.parseFloat(ctx.getText()));
        return decimalFloatConstant;
    }

    @Override
    public FloatConstantFortran visitFloatHexadecimalConstant(SimpleFortran2Parser.FloatHexadecimalConstantContext ctx) {
        FloatConstantFortran hexadecimalFloatConstant = new FloatConstantFortran();
        hexadecimalFloatConstant.setActualValue(convertFromRadixToDecimal(ctx.getText(), 16));
        return hexadecimalFloatConstant;
    }

    @Override
    public FloatConstantFortran visitFloatOctalConstant(SimpleFortran2Parser.FloatOctalConstantContext ctx) {
        FloatConstantFortran octalFloatConstant = new FloatConstantFortran();
        octalFloatConstant.setActualValue(convertFromRadixToDecimal(ctx.getText(), 8));
        return octalFloatConstant;
    }

    @Override
    public FloatConstantFortran visitFloatBinaryConstant(SimpleFortran2Parser.FloatBinaryConstantContext ctx) {
        FloatConstantFortran binaryFloatConstant = new FloatConstantFortran();
        binaryFloatConstant.setActualValue(convertFromRadixToDecimal(ctx.getText(), 2));
        return binaryFloatConstant;
    }
}
