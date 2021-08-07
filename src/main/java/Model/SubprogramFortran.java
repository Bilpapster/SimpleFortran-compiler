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

    @Override
    public String toString() {

        return header.toString() +
                '\n' +
                body.toString() +
                "\nEND\n";
    }
}
