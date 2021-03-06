package Model;

import Model.SymbolTable.SymbolTableFortran;

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

    @Override
    public String toString() {
        StringBuilder stringRepresentation = new StringBuilder();

        stringRepresentation.append(dataType.toString()).append("FUNCTION ")
                .append(identifier).append("(").append(formalParameters.get(0));

        for (int index = 1; index < formalParameters.size(); index++) {
            stringRepresentation.append(", ").append(formalParameters.get(index).toString());
        }
        return stringRepresentation.append(")").toString();
    }

    @Override
    public void performSemanticAnalysis() {
        SymbolTableFortran symbolTable = SymbolTableFortran.getInstance();
        FunctionSpecificationFortran functionSpecification = new FunctionSpecificationFortran(this.dataType);

        for (FormalParameterFortran formalParameter : formalParameters) {
            formalParameter.performSemanticAnalysis();
            DataTypeFortran parameterType = formalParameter.getDataType();
            for (int variableCounter = 0; variableCounter < formalParameter.getNumberOfParameters(); variableCounter++) {
                functionSpecification.addParameter(parameterType);
            }
        }

        symbolTable.insertFunction(this.identifier, functionSpecification);
    }

    @Override
    public void performSmartLookAhead() {
        SymbolTableFortran.getInstance().insertLookedAheadFunction(identifier, dataType);
    }
}
