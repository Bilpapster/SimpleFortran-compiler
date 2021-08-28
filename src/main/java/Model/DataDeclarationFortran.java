package Model;

import java.util.List;

public class DataDeclarationFortran extends DeclarationFortran{
    private List<DataValueFortran> dataValuesFortran;

    public void setDataValues(List<Model.DataValueFortran> dataValueFortran) {
        dataValuesFortran = dataValueFortran;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder("DATA " + dataValuesFortran.get(0));

        for (int index = 1; index < dataValuesFortran.size(); index++) {
            stringRepresentation.append(", ").append(dataValuesFortran.get(index));
        }

        return stringRepresentation.append('\n').toString();
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}


