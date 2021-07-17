package Model;

import java.util.List;

public class SubroutineHeaderFortran implements HeaderFortran{
    private String identifier;
    private List<FormalParameterFortran> formalParameters;
    private boolean hasFormalParameters = false;
}
