package Model;

import javax.xml.crypto.Data;

public class StringConstantFortran extends SimpleConstantFortran{
    private String actualValue;

    public StringConstantFortran(String actualValue) {
        this.actualValue = actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }

    @Override
    public String toString() {
        return actualValue;
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }

    @Override
    public DataTypeFortran getDataType() {
        DataTypeFortran returnType = DataTypeFortran.STRING;
        returnType.setAsList(false);
        returnType.setAsArray(false);
        return returnType;
    }
}
