package Model;

import java.util.List;

public class DataDeclarationFortran implements DeclarationFortran{
    private List<DataValueFortran> DataValueFortran;

    public void setDataValues(List<Model.DataValueFortran> dataValueFortran) {
        DataValueFortran = dataValueFortran;
    }
}
