package Model;

import java.util.ArrayList;

public class FunctionSpecificationFortran {
    private final ArrayList<DataTypeFortran> parameters = new ArrayList<>();
    private DataTypeFortran returnType = null;

    public FunctionSpecificationFortran(DataTypeFortran returnType) {
        this.returnType = returnType;
    }

    public FunctionSpecificationFortran() {
        // intentionally left blank
    }

    public DataTypeFortran getReturnType() {
        return returnType;
    }

    public void setReturnType(DataTypeFortran returnType) {
        this.returnType = returnType;
    }

    public void addParameter(DataTypeFortran parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FunctionSpecificationFortran)) {
            return false;
        }

        FunctionSpecificationFortran other = (FunctionSpecificationFortran) obj;

        if (parameters.size() != other.parameters.size()) {
            return false;
        }

        for (int parameterIndex = 0; parameterIndex < parameters.size(); parameterIndex++) {
            if (this.parameters.get(parameterIndex) != other.parameters.get(parameterIndex)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return parameters.toString();
    }
}
