package Model;

import java.util.List;

public class SubroutineHeaderFortran extends HeaderFortran {
    private List<FormalParameterFortran> formalParameters;
    private boolean hasFormalParameters = false;

    public void setFormalParameters(List<FormalParameterFortran> formalParameters) {
        this.formalParameters = formalParameters;
        hasFormalParameters = true;
    }

    @Override
    public String toString() {

        StringBuilder stringRepresentation = new StringBuilder();

        stringRepresentation.append("SUBROUTINE ").append(this.identifier);

        if (!hasFormalParameters) {
            return stringRepresentation.toString();
        }

        stringRepresentation.append("(").append(formalParameters.get(0));

        for (int index = 1; index < formalParameters.size(); index++) {
            stringRepresentation.append(", ").append(formalParameters.get(index));
        }

        return stringRepresentation.append(")").toString();

    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
