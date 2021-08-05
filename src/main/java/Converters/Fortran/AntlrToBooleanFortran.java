package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;

public class AntlrToBooleanFortran extends SimpleFortran2BaseVisitor<Boolean> {
    @Override
    public Boolean visitListKeyword(SimpleFortran2Parser.ListKeywordContext ctx) {
        return true;
    }

    @Override
    public Boolean visitEmptyListKeyword(SimpleFortran2Parser.EmptyListKeywordContext ctx) {
        return false;
    }
}
