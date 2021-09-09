// Generated from D:/Papster/Codes/Antlr/SimpleFortran/src/main/ANTLRv4 Grammars\SimpleFortran2.g4 by ANTLR 4.9.1
package BaseClassesFortran;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleFortran2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleFortran2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SimpleFortran2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpleFortran2Parser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataDeclaration}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDeclaration(SimpleFortran2Parser.DataDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationsEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsEndCondition(SimpleFortran2Parser.DeclarationsEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimpleFortran2Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommonDeclaration}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonDeclaration(SimpleFortran2Parser.CommonDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(SimpleFortran2Parser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(SimpleFortran2Parser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(SimpleFortran2Parser.ComplexTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalType(SimpleFortran2Parser.LogicalTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterType(SimpleFortran2Parser.CharacterTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link SimpleFortran2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(SimpleFortran2Parser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfUndefinedVariables}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfUndefinedVariables(SimpleFortran2Parser.ListOfUndefinedVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UndefinedVariablesEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndefinedVariablesEndCondition(SimpleFortran2Parser.UndefinedVariablesEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayUndefinedVariable}
	 * labeled alternative in {@link SimpleFortran2Parser#undefined_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayUndefinedVariable(SimpleFortran2Parser.ArrayUndefinedVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalUndefinedVariable}
	 * labeled alternative in {@link SimpleFortran2Parser#undefined_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalUndefinedVariable(SimpleFortran2Parser.NormalUndefinedVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListKeyword}
	 * labeled alternative in {@link SimpleFortran2Parser#listspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListKeyword(SimpleFortran2Parser.ListKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyListKeyword}
	 * labeled alternative in {@link SimpleFortran2Parser#listspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListKeyword(SimpleFortran2Parser.EmptyListKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfDimensions}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfDimensions(SimpleFortran2Parser.ListOfDimensionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimensionsEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionsEndCondition(SimpleFortran2Parser.DimensionsEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerNumericalDimension}
	 * labeled alternative in {@link SimpleFortran2Parser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumericalDimension(SimpleFortran2Parser.IntegerNumericalDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierDimension}
	 * labeled alternative in {@link SimpleFortran2Parser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierDimension(SimpleFortran2Parser.IdentifierDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfCBlocks}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfCBlocks(SimpleFortran2Parser.ListOfCBlocksContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CBlockEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCBlockEndCondition(SimpleFortran2Parser.CBlockEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#cblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCblock(SimpleFortran2Parser.CblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfIdentifiers}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfIdentifiers(SimpleFortran2Parser.ListOfIdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierListEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierListEndCondition(SimpleFortran2Parser.IdentifierListEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataValueListEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueListEndCondition(SimpleFortran2Parser.DataValueListEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfDataValuesList}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfDataValuesList(SimpleFortran2Parser.ListOfDataValuesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(SimpleFortran2Parser.Value_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DataValueEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueEndCondition(SimpleFortran2Parser.DataValueEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfDataValues}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfDataValues(SimpleFortran2Parser.ListOfDataValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatValue}
	 * labeled alternative in {@link SimpleFortran2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatValue(SimpleFortran2Parser.RepeatValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedValueConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedValueConstant(SimpleFortran2Parser.SignedValueConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalValueConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalValueConstant(SimpleFortran2Parser.NormalValueConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerConstantRepeat}
	 * labeled alternative in {@link SimpleFortran2Parser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstantRepeat(SimpleFortran2Parser.IntegerConstantRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoConstantRepeat}
	 * labeled alternative in {@link SimpleFortran2Parser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoConstantRepeat(SimpleFortran2Parser.NoConstantRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusSign}
	 * labeled alternative in {@link SimpleFortran2Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusSign(SimpleFortran2Parser.PlusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusSign}
	 * labeled alternative in {@link SimpleFortran2Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSign(SimpleFortran2Parser.MinusSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoSign}
	 * labeled alternative in {@link SimpleFortran2Parser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoSign(SimpleFortran2Parser.NoSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleConstant(SimpleFortran2Parser.SimpleConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexConstant(SimpleFortran2Parser.ComplexConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerSimpleConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSimpleConstant(SimpleFortran2Parser.IntegerSimpleConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatSimpleConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatSimpleConstant(SimpleFortran2Parser.FloatSimpleConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueKeywordConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueKeywordConstant(SimpleFortran2Parser.TrueKeywordConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseKeywordConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseKeywordConstant(SimpleFortran2Parser.FalseKeywordConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharacterConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterConstant(SimpleFortran2Parser.CharacterConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(SimpleFortran2Parser.StringConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#complex_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_constant(SimpleFortran2Parser.Complex_constantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatDecimalConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#float_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatDecimalConstant(SimpleFortran2Parser.FloatDecimalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatHexadecimalConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#float_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatHexadecimalConstant(SimpleFortran2Parser.FloatHexadecimalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatOctalConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#float_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatOctalConstant(SimpleFortran2Parser.FloatOctalConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatBinaryConstant}
	 * labeled alternative in {@link SimpleFortran2Parser#float_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatBinaryConstant(SimpleFortran2Parser.FloatBinaryConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfLabeledStatements}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfLabeledStatements(SimpleFortran2Parser.ListOfLabeledStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabeledStatementEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementEndCondition(SimpleFortran2Parser.LabeledStatementEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabeledStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(SimpleFortran2Parser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStatement(SimpleFortran2Parser.NormalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerDecimalLabel}
	 * labeled alternative in {@link SimpleFortran2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDecimalLabel(SimpleFortran2Parser.IntegerDecimalLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerHexadecimalLabel}
	 * labeled alternative in {@link SimpleFortran2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerHexadecimalLabel(SimpleFortran2Parser.IntegerHexadecimalLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerOctalLabel}
	 * labeled alternative in {@link SimpleFortran2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOctalLabel(SimpleFortran2Parser.IntegerOctalLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerBinaryLabel}
	 * labeled alternative in {@link SimpleFortran2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerBinaryLabel(SimpleFortran2Parser.IntegerBinaryLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(SimpleFortran2Parser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(SimpleFortran2Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SimpleFortran2Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoToStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStatement(SimpleFortran2Parser.GoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleFortran2Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubroutineStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineStatement(SimpleFortran2Parser.SubroutineStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IOStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIOStatement(SimpleFortran2Parser.IOStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(SimpleFortran2Parser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleFortran2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStatement(SimpleFortran2Parser.StopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimpleFortran2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessVariable}
	 * labeled alternative in {@link SimpleFortran2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessVariable(SimpleFortran2Parser.ArrayAccessVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListFunctionVariable}
	 * labeled alternative in {@link SimpleFortran2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListFunctionVariable(SimpleFortran2Parser.ListFunctionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierVariable}
	 * labeled alternative in {@link SimpleFortran2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierVariable(SimpleFortran2Parser.IdentifierVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEndCondition(SimpleFortran2Parser.ExpressionEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfExpressions}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfExpressions(SimpleFortran2Parser.ListOfExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOperation(SimpleFortran2Parser.VariableOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleConstantOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleConstantOperation(SimpleFortran2Parser.SimpleConstantOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionOperation(SimpleFortran2Parser.AdditionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedOperation(SimpleFortran2Parser.ParenthesizedOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperation(SimpleFortran2Parser.RelationalOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperation(SimpleFortran2Parser.NotOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewOperation(SimpleFortran2Parser.NewOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperation(SimpleFortran2Parser.PowerOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperation(SimpleFortran2Parser.AndOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOperation(SimpleFortran2Parser.LengthOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperation(SimpleFortran2Parser.OrOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivisionOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionOperation(SimpleFortran2Parser.DivisionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedOperation(SimpleFortran2Parser.SignedOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonizedOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonizedOperation(SimpleFortran2Parser.ColonizedOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubtractionOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionOperation(SimpleFortran2Parser.SubtractionOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOperation(SimpleFortran2Parser.ListOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusSignedOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusSignedOperation(SimpleFortran2Parser.MinusSignedOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationOperation}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationOperation(SimpleFortran2Parser.MultiplicationOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExpressionTest}
	 * labeled alternative in {@link SimpleFortran2Parser#listexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpressionTest(SimpleFortran2Parser.ListExpressionTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyListExpression}
	 * labeled alternative in {@link SimpleFortran2Parser#listexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListExpression(SimpleFortran2Parser.EmptyListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalGoToStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalGoToStatement(SimpleFortran2Parser.NormalGoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleGoToStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleGoToStatement(SimpleFortran2Parser.MultipleGoToStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfLabels}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfLabels(SimpleFortran2Parser.ListOfLabelsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LabelEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelEndCondition(SimpleFortran2Parser.LabelEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalIfStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalIfStatement(SimpleFortran2Parser.LogicalIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticIfStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticIfStatement(SimpleFortran2Parser.ArithmeticIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubroutineCall}
	 * labeled alternative in {@link SimpleFortran2Parser#subroutine_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineCall(SimpleFortran2Parser.SubroutineCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(SimpleFortran2Parser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#io_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(SimpleFortran2Parser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadItemEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadItemEndCondition(SimpleFortran2Parser.ReadItemEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfReadItems}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfReadItems(SimpleFortran2Parser.ListOfReadItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableReadItem}
	 * labeled alternative in {@link SimpleFortran2Parser#read_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableReadItem(SimpleFortran2Parser.VariableReadItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicitLoopReadItem}
	 * labeled alternative in {@link SimpleFortran2Parser#read_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitLoopReadItem(SimpleFortran2Parser.ImplicitLoopReadItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationSpace}
	 * labeled alternative in {@link SimpleFortran2Parser#iter_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationSpace(SimpleFortran2Parser.IterationSpaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalStep}
	 * labeled alternative in {@link SimpleFortran2Parser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalStep(SimpleFortran2Parser.NormalStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStep}
	 * labeled alternative in {@link SimpleFortran2Parser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStep(SimpleFortran2Parser.EmptyStepContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfWriteItems}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfWriteItems(SimpleFortran2Parser.ListOfWriteItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteItemEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteItemEndCondition(SimpleFortran2Parser.WriteItemEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionWriteItem}
	 * labeled alternative in {@link SimpleFortran2Parser#write_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionWriteItem(SimpleFortran2Parser.ExpressionWriteItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicitLoopWriteItem}
	 * labeled alternative in {@link SimpleFortran2Parser#write_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitLoopWriteItem(SimpleFortran2Parser.ImplicitLoopWriteItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BranchStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranchStatement(SimpleFortran2Parser.BranchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStatement}
	 * labeled alternative in {@link SimpleFortran2Parser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(SimpleFortran2Parser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(SimpleFortran2Parser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseTail}
	 * labeled alternative in {@link SimpleFortran2Parser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseTail(SimpleFortran2Parser.ElseTailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoTail}
	 * labeled alternative in {@link SimpleFortran2Parser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoTail(SimpleFortran2Parser.NoTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SimpleFortran2Parser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfSubprograms}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfSubprograms(SimpleFortran2Parser.ListOfSubprogramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubprogramEndCondition}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramEndCondition(SimpleFortran2Parser.SubprogramEndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleFortran2Parser#subprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram(SimpleFortran2Parser.SubprogramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFunctionHeader}
	 * labeled alternative in {@link SimpleFortran2Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunctionHeader(SimpleFortran2Parser.NormalFunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListSubroutineHeader}
	 * labeled alternative in {@link SimpleFortran2Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSubroutineHeader(SimpleFortran2Parser.ListSubroutineHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalSubroutineHeader}
	 * labeled alternative in {@link SimpleFortran2Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalSubroutineHeader(SimpleFortran2Parser.NormalSubroutineHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListOfFormalParameters}
	 * labeled alternative in {@link SimpleFortran2Parser#formal_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfFormalParameters(SimpleFortran2Parser.ListOfFormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormalParametersEndCondition}
	 * labeled alternative in {@link SimpleFortran2Parser#formal_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParametersEndCondition(SimpleFortran2Parser.FormalParametersEndConditionContext ctx);
}