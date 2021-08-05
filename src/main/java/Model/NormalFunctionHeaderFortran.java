package Model;

import java.util.List;

public class NormalFunctionHeaderFortran extends HeaderFortran{
    protected DataTypeFortran dataType;
    protected List<FormalParameterFortran> formalParameters;

    public void setDataType(DataTypeFortran dataType) {
        this.dataType = dataType;
    }

    public void setFormalParameters(List<FormalParameterFortran> formalParameters) {
        this.formalParameters = formalParameters;
    }

    public DataTypeFortran getDataType() {
        return dataType;
    }
}
