package ErrorHandling;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {
    private static boolean syntaxErrors = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        syntaxErrors = true;
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax error");
        System.err.println("Token \"" + ((Token) offendingSymbol).getText() + "\""
                +
                "(line " + line + ", column " + charPositionInLine + ")"
                +
                ": " + msg);
        System.err.println("Rule stack: " + stack + "\n");

    }

    public static boolean hasSyntaxErrors() {
        return syntaxErrors;
    }
}
