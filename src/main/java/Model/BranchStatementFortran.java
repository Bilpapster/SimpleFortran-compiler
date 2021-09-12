package Model;

import Model.SymbolTable.SemanticErrorsManager;
import Model.SymbolTable.SymbolTableFortran;

public class BranchStatementFortran extends CompoundStatementFortran {
    private ExpressionFortran expression;
    private BodyFortran body;
    private TailFortran tail;

    public void setExpression(ExpressionFortran expression) {
        this.expression = expression;
    }

    public void setBody(BodyFortran body) {
        this.body = body;
    }

    public void setTail(TailFortran tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "IF(" + expression.toString() + ") THEN\n" + body.toString() + '\n' + tail.toString();

    }

    @Override
    public void performSemanticAnalysis() {
        if (expression.getDataType() != DataTypeFortran.LOGICAL) {
            SemanticErrorsManager.addSemanticError("Incompatible type in a branch statement ('" + this.toString() +
                    "'). The expression used is of type " + expression.getDataType() + " (expected LOGICAL)");
        }

        SymbolTableFortran.getInstance().enter();
        body.performSemanticAnalysis();
        SymbolTableFortran.getInstance().exit();

        SymbolTableFortran.getInstance().enter();
        tail.performSemanticAnalysis();
        SymbolTableFortran.getInstance().exit();
    }
}
