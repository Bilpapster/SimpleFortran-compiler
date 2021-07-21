package Model;

import java.util.List;

public class SubroutineHeaderFortran extends HeaderFortran{
    private List<FormalParameterFortran> formalParameters;
    private boolean hasFormalParameters = false;

    public void setFormalParameters(List<FormalParameterFortran> formalParameters) {
        this.formalParameters = formalParameters;
        hasFormalParameters = true;
    }
}
