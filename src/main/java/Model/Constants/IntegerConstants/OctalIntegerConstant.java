package Model.Constants.IntegerConstants;

public class OctalIntegerConstant extends IntegerConstant{
    public OctalIntegerConstant(String valueAsString) {
        super(valueAsString);
    }

    @Override
    public void defineRadix() {
        this.radix = 8;
    }
}
