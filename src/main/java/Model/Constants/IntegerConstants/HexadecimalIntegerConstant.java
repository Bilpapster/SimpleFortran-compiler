package Model.Constants.IntegerConstants;

public class HexadecimalIntegerConstant extends IntegerConstant{

    public HexadecimalIntegerConstant(String valueAsString) {
        super(valueAsString);
    }

    @Override
    public void defineRadix() {
        this.radix = 16;
    }
}
