package Model.Constants.IntegerConstants;

public class DecimalIntegerConstant extends IntegerConstant{

    public DecimalIntegerConstant(String valueAsString) {
        super(valueAsString);
    }

    @Override
    public void defineRadix() {
        this.radix = 10;
    }
}
