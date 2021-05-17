package Model.Constants;

import Model.DataType;
import Model.Expressions.Expression;

public abstract class Constant implements Expression {
    protected DataType dataType;

    public Constant() {
        specifyDataType();
    }

    protected abstract void specifyDataType();

    protected abstract void defineValueFromString(String valueAsString);
}
