package Model;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public enum ErrorType {
    VARIABLE_UNDECLARED,
    VARIABLE_REDECLARED,
    ;

    public static String getErrorDescription() {
        return "a";
    }

    public static String getErrorDescription(TerminalNode violatingNode, ErrorType errorType) {
        StringBuilder errorDescription = new StringBuilder();
        String variableName = violatingNode.getText();
        switch (errorType) {
            case VARIABLE_UNDECLARED:
                errorDescription.
                        append("Error (undeclared variable): Variable \"").
                        append(variableName).
                        append("\" is used but has never been declared ");
                break;
            case VARIABLE_REDECLARED:
                errorDescription.
                        append("Error (variable redefinition): Variable \"").
                        append(variableName).
                        append("\" has already been declared ");
                break;
        }
        errorDescription.append("(").
                append(getLineAndColumnText(violatingNode)).
                append(")");
        return errorDescription.toString();
    }

    private static String getLineAndColumnText(TerminalNode violatingNode) {
        StringBuilder lineAndColumnText = new StringBuilder();
        Token violatingToken = violatingNode.getSymbol();
        lineAndColumnText.
                append("line: ").
                append(violatingToken.getLine()).
                append(", column: ").
                append(violatingToken.getCharPositionInLine() + 1);
        return lineAndColumnText.toString();
    }
}
