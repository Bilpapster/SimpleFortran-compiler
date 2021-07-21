package Model;

public class SubprogramFortran extends ProgramFortran{
    private HeaderFortran header;
    private BodyFortran body;

    public void setHeader(HeaderFortran header) {
        this.header = header;
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }
}
