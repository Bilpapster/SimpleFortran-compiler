package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.DataValueFortran;

import java.util.ArrayList;
import java.util.List;

public class AntlrToListOfDataValuesFortran extends SimpleFortran2BaseVisitor<List<DataValueFortran>> {
    private final List<DataValueFortran> dataValues = new ArrayList<>();
    private final AntlrToListOfValuesFortran valueListVisitor = new AntlrToListOfValuesFortran();

    @Override
    public List<DataValueFortran> visitListOfDataValuesList(SimpleFortran2Parser.ListOfDataValuesListContext ctx) {
        visit(ctx.vals());
        DataValueFortran dataValue = new DataValueFortran();
        dataValue.setIdentifier(ctx.IDENTIFIER().getText());
        dataValue.setValues(valueListVisitor.visit(ctx.value_list()));
        dataValues.add(dataValue);
        return dataValues;
    }

    @Override
    public List<DataValueFortran> visitDataValueListEndCondition(SimpleFortran2Parser.DataValueListEndConditionContext ctx) {
        DataValueFortran dataValue = new DataValueFortran();
        dataValue.setIdentifier(ctx.IDENTIFIER().getText());
        dataValue.setValues(valueListVisitor.visit(ctx.value_list()));
        dataValues.add(dataValue);
        return dataValues;
    }
}
