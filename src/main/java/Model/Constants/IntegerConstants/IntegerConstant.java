package Model.Constants.IntegerConstants;

import Model.Constants.Constant;
import Model.DataType;

public abstract class IntegerConstant extends Constant {
    protected int value;
    protected int radix;

    public IntegerConstant(String valueAsString) {
        super();
        defineRadix();
        defineValueFromString(valueAsString);
    }

    public abstract void defineRadix();

    @Override
    protected void defineValueFromString(String valueAsString) {
        Integer.parseInt(valueAsString, radix);
    }

    @Override
    protected void specifyDataType() {
        this.dataType = DataType.INT;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
