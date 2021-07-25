package Converters.Fortran;

import BaseClassesFortran.SimpleFortran2BaseVisitor;
import BaseClassesFortran.SimpleFortran2Parser;
import Model.IOStatementFortran;
import Model.ReadStatementFortran;
import Model.WriteStatementFortran;

public class AntlrToIOStatementFortran extends SimpleFortran2BaseVisitor<IOStatementFortran> {
    @Override
    public IOStatementFortran visitReadStatement(SimpleFortran2Parser.ReadStatementContext ctx) {
        AntlrToReadListFortran readListVisitor = new AntlrToReadListFortran();
        ReadStatementFortran readStatement = new ReadStatementFortran();
        readStatement.setReadList(readListVisitor.visit(ctx.read_list()));
        return readStatement;
    }

    @Override
    public IOStatementFortran visitWriteStatement(SimpleFortran2Parser.WriteStatementContext ctx) {
        AntlrToWriteListFortran writeListVisitor = new AntlrToWriteListFortran();
        WriteStatementFortran writeStatement = new WriteStatementFortran();
        writeStatement.setWriteList(writeListVisitor.visit(ctx.write_list()));
        return writeStatement;
    }

}
