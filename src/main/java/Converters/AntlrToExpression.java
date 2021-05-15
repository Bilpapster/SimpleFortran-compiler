package Converters;

import java.util.Map;
import java.util.HashMap;

import Listeners.SemanticErrorsHandler;
import Model.*;
import Model.Number;
import BaseClasses.SimpleFortranParser;
import BaseClasses.SimpleFortranBaseVisitor;


public class AntlrToExpression extends SimpleFortranBaseVisitor<Expression> {
    private final Map<String, Integer> declaredVariables = new HashMap<>();

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
            SemanticErrorsHandler.addError(ErrorType.getErrorDescription(ctx.IDENTIFIER(),
                                           ErrorType.VARIABLE_REDECLARED));
        } else {
            declaredVariables.put(variableName, Integer.parseInt(ctx.NUMBER().getText()));
        }
        return new VariableDeclaration(variableName, Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override
    public Expression visitVariable(SimpleFortranParser.VariableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        if (!declaredVariables.containsKey(variableName)) {
            SemanticErrorsHandler.addError(ErrorType.getErrorDescription(ctx.IDENTIFIER(),
                                           ErrorType.VARIABLE_UNDECLARED));
        }
        return new Variable(variableName);
    }
}
