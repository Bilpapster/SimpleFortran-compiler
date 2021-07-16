package Converters;

import java.util.Map;
import java.util.HashMap;

import ErrorHandling.ErrorType;
import ErrorHandling.SemanticErrorsHandler;
import Model.Declarations.VariableDeclarationOld;
import Model.Expressions.*;
import BaseClasses.SimpleFortranParser;
import BaseClasses.SimpleFortranBaseVisitor;
import Model.Expressions.BinaryOperations.Addition;
import Model.Expressions.BinaryOperations.Division;
import Model.Expressions.BinaryOperations.Multiplication;
import Model.Expressions.BinaryOperations.Subtraction;
import Model.Expressions.UnaryOperations.Number;
import Model.Expressions.UnaryOperations.Variable;


public class AntlrToExpression extends SimpleFortranBaseVisitor<Expression> {
    private final Map<String, Integer> declaredVariables = new HashMap<>();

    @Override
    public Expression visitMultiplicationOrDivision(SimpleFortranParser.MultiplicationOrDivisionContext ctx) {
        if (ctx.getChild(1).getText().equals(Character.toString('*'))) {
            return visitMultiplication(ctx);
        } else {
            return visitDivision(ctx);
        }
    }

    public Expression visitMultiplication(SimpleFortranParser.MultiplicationOrDivisionContext ctx) {
        return new Multiplication(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
    }

    public Expression visitDivision(SimpleFortranParser.MultiplicationOrDivisionContext ctx) {
        return new Division(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
    }

    @Override
    public Expression visitAdditionOrSubtraction(SimpleFortranParser.AdditionOrSubtractionContext ctx) {
        if (ctx.getChild(1).getText().equals(Character.toString('+'))) {
            return visitAddition(ctx);
        } else {
            return visitSubtraction(ctx);
        }
    }

    public Expression visitAddition(SimpleFortranParser.AdditionOrSubtractionContext ctx) {
        return new Addition(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
    }

    public Expression visitSubtraction(SimpleFortranParser.AdditionOrSubtractionContext ctx) {
        return new Subtraction(visit(ctx.getChild(0)), visit(ctx.getChild(2)));
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
        return new VariableDeclarationOld(variableName, Integer.parseInt(ctx.NUMBER().getText()));
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
