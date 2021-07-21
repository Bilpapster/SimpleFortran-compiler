package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.DataTypeFortran;


public class AntlrToDataType extends SimpleFortran2BaseVisitor<DataTypeFortran> {
    @Override
    public DataTypeFortran visitIntegerType(SimpleFortran2Parser.IntegerTypeContext ctx) {
        return DataTypeFortran.INTEGER;
    }

    @Override
    public DataTypeFortran visitRealType(SimpleFortran2Parser.RealTypeContext ctx) {
        return DataTypeFortran.REAL;
    }

    @Override
    public DataTypeFortran visitComplexType(SimpleFortran2Parser.ComplexTypeContext ctx) {
        return DataTypeFortran.COMPLEX;
    }

    @Override
    public DataTypeFortran visitLogicalType(SimpleFortran2Parser.LogicalTypeContext ctx) {
        return DataTypeFortran.LOGICAL;
    }

    @Override
    public DataTypeFortran visitCharacterType(SimpleFortran2Parser.CharacterTypeContext ctx) {
        return DataTypeFortran.CHARACTER;
    }

    @Override
    public DataTypeFortran visitStringType(SimpleFortran2Parser.StringTypeContext ctx) {
        return DataTypeFortran.STRING;
    }
}
