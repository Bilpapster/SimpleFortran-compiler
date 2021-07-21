package Model;

public class TailFortran {
    private BodyFortran body = null;
    private boolean hasBody = false;

    public void setBody(BodyFortran body) {
        this.body = body;
        this.hasBody = true;
    }
}
