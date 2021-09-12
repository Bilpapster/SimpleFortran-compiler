package Model;

import Model.SymbolTable.SemanticErrorsManager;

public class RelationalOperationFortran extends BinaryOperationFortran {
    private String relationalOperand;

    @Override
    public void setOperand() {
        this.operand = '<';
    }

    public void setRelationalOperand(String relationalOperand) {
        this.relationalOperand = relationalOperand;
    }

    @Override
    public String toString() {
        return expressionLeft + " " + relationalOperand + " " + expressionRight;
    }

    @Override
    public void performSemanticAnalysis() {
        DataTypeFortran dataTypeLeft = expressionLeft.getDataType();
        DataTypeFortran dataTypeRight = expressionRight.getDataType();

        if (dataTypeLeft.isArithmeticExceptForComplex() && dataTypeRight.isArithmeticExceptForComplex()) {
            // data types are compatible with each other, so nothing more needs to be done
            return;
        }

        if (dataTypeLeft == DataTypeFortran.STRING && dataTypeRight == DataTypeFortran.STRING) {
            // data types are compatible with each other, so nothing more needs to be done
            return;
        }

        if (dataTypeLeft == DataTypeFortran.CHARACTER && dataTypeRight == DataTypeFortran.CHARACTER) {
            // data types are compatible with each other, so nothing more needs to be done
            return;
        }

        if (relationalOperand.equals(".eq.") || relationalOperand.equals(".ne.")) {
            if (dataTypeLeft == DataTypeFortran.COMPLEX && dataTypeRight == DataTypeFortran.COMPLEX) {
                // data types are compatible with each other, so nothing more needs to be done
                return;
            }
        }

        String errorMessage = "Incompatible data types for a relational operation ('" + relationalOperand + "'). " +
                "The left operator ('" + expressionLeft.toString() + "') is of type " + dataTypeLeft +
                ", while the right operator ('" + expressionRight.toString() + "') is of type " + dataTypeRight + ".";
        SemanticErrorsManager.addSemanticError(errorMessage);
    }

    @Override
    public DataTypeFortran getDataType() {
        return DataTypeFortran.LOGICAL;
    }
}
