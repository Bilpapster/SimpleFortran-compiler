package Model.Constants.IntegerConstants;

public class BinaryIntegerConstant extends IntegerConstant{
    public BinaryIntegerConstant(String valueAsString) {
        super(valueAsString);
    }

    @Override
    public void defineRadix() {
        this.radix = 2;
    }
}
