package Model;

public class TailFortran extends ASTNodeFortran {
    private BodyFortran body = null;
    private boolean hasBody = false;

    public void setBody(BodyFortran body) {
        this.body = body;
        this.hasBody = true;
    }

    @Override
    public String toString() {
        if (hasBody) {
            return "ELSE\n" + body.toString() + "ENDIF";
        }
        return "ENDIF";
    }

    @Override
    protected void performSemanticAnalysis() {
        //todo
    }
}
