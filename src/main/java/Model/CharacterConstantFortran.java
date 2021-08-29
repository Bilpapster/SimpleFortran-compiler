package Model;

public class CharacterConstantFortran extends SimpleConstantFortran{
    private char actualValue;

    public CharacterConstantFortran(char actualValue) {
        this.actualValue = actualValue;
    }

    public void setActualValue(char actualValue) {
        this.actualValue = actualValue;
    }

    @Override
    public String toString() {
        return Character.toString(actualValue);
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
