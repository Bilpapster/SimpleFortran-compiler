package Model;

public class RepeatValueFortran extends NormalValueFortran{
    private RepeatFortran repeat;
    private String sign;

    public void setRepeat(RepeatFortran repeat) {
        this.repeat = repeat;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return repeat + " " + sign + constant;
    }

    @Override
    public void performSemanticAnalysis() {
        //todo
    }
}
