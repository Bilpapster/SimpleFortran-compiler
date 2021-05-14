package Converters;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

import Model.*;
import Model.Number;
import BaseClasses.SimpleFortranParser;
import BaseClasses.SimpleFortranBaseVisitor;


public class AntlrToExpression extends SimpleFortranBaseVisitor<Expression> {
    private final Map<String, Integer> declaredVariables = new HashMap<>();
    private final List<String> semanticErrors;

    public AntlrToExpression(List<String> semanticErrors) {
        this.semanticErrors = semanticErrors;
    }

    @Override
    public Expression visitMultiplication(SimpleFortranParser.MultiplicationContext ctx) {
        return new Multiplication(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
    }

    @Override
    public Expression visitAddition(SimpleFortranParser.AdditionContext ctx) {
        return new Addition(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
    }

    @Override
    public Expression visitNumber(SimpleFortranParser.NumberContext ctx) {
        return new Number(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitDeclaration(SimpleFortranParser.DeclarationContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        if (declaredVariables.containsKey(variableName)) {
            Token identifierToken = ctx.IDENTIFIER().getSymbol();
            int line = identifierToken.getLine();
            int column = identifierToken.getCharPositionInLine();
            semanticErrors.add("Error (variable redefinition): Variable \"" + variableName
                    + "\" has been already declared (line: " + line + ", column: " + column + ")");
        } else {
            declaredVariables.put(variableName, Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new VariableDeclaration(variableName, Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitVariable(SimpleFortranParser.VariableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        if (!declaredVariables.containsKey(variableName)) {
            Token identifierToken = ctx.IDENTIFIER().getSymbol();
            int line = identifierToken.getLine();
            int column = identifierToken.getCharPositionInLine();
            semanticErrors.add("Error (undeclared variable): Variable \"" + variableName
                    + "\" is used but never declared or initialized (line: " + line + ", column: " + column + ")");
        }
        return new Variable(variableName);
    }
}
