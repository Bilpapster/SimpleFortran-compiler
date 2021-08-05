package Model;

import java.util.List;

public class ListUndefinedVariableFortran extends AbstractUndefinedVariableFortran {
    private List<DimensionFortran> dimensions;

    public void setDimensions(List<DimensionFortran> dimensions) {
        this.dimensions = dimensions;
    }
}
