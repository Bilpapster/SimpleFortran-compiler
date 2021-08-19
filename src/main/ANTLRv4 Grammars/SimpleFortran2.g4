grammar SimpleFortran2;

/* Parser rules */

program                 : body END subprograms EOF
                        ;

body                    : declarations statements
                        ;

declarations            : declarations type variables                                 # VariableDeclaration
                        | declarations COMMON cblock_list                             # CommonDeclaration
                        | declarations DATA vals                                      # DataDeclaration
                        |                                                             # DeclarationsEndCondition
                        ;

type                    : INTEGER                                                     # IntegerType
                        | REAL                                                        # RealType
                        | COMPLEX                                                     # ComplexType
                        | LOGICAL                                                     # LogicalType
                        | CHARACTER                                                   # CharacterType
                        | STRING                                                      # StringType
                        ;

variables               : variables COMMA undefined_variable                          # ListOfUndefinedVariables
                        | undefined_variable                                          # UndefinedVariablesEndCondition
                        ;

undefined_variable      : listspec IDENTIFIER LEFT_PARENTHESIS dims RIGHT_PARENTHESIS # ListUndefinedVariable
                        | listspec IDENTIFIER                                         # NormalUndefinedVariable
                        ;

listspec                : LIST                                                        # ListKeyword
                        |                                                             # EmptyListKeyword
                        ;

dims                    : dims COMMA dim                                              # ListOfDimensions
                        | dim                                                         # DimensionsEndCondition
                        ;

dim                     : label                                                       # IntegerNumericalDimension
                        | IDENTIFIER                                                  # IdentifierDimension
                        ;

cblock_list             : cblock_list cblock                                          # ListOfCBlocks
                        | cblock                                                      # CBlockEndCondition
                        ;

cblock                  : DIVOP IDENTIFIER DIVOP identifier_list
                        ;

identifier_list         : identifier_list COMMA IDENTIFIER                            # ListOfIdentifiers
                        | IDENTIFIER                                                  # IdentifierListEndCondition
                        ;

vals                    : vals COMMA IDENTIFIER value_list                            # ListOfDataValuesList
                        | IDENTIFIER value_list                                       # DataValueListEndCondition
                        ;

value_list              : DIVOP values DIVOP;

values                  : values COMMA value                                          # ListOfDataValues
                        | value                                                       # DataValueEndCondition
                        ;

value                   : repeat sign constant                                        # RepeatValue
                        | ADDOP constant                                              # SignedValueConstant
                        | constant                                                    # NormalValueConstant
                        ;

repeat                  : label MULOP                                                 # IntegerConstantRepeat
                        | MULOP                                                       # NoConstantRepeat
                        ;

sign                    : ADDOP                                                       # PlusSign
                        | SUBOP                                                       # MinusSign
                        |                                                             # NoSign
                        ;

constant                : simple_constant                                             # SimpleConstant
                        | complex_constant                                            # ComplexConstant
                        ;

simple_constant         : label                                                       # IntegerSimpleConstant
                        | float_constant                                              # FloatSimpleConstant
                        | TRUE                                                        # TrueKeywordConstant
                        | FALSE                                                       # FalseKeywordConstant
                        | CCONST                                                      # CharacterConstant
                        | SCONST                                                      # StringConstant
                        ;

complex_constant        : LEFT_PARENTHESIS float_constant COLON sign float_constant  RIGHT_PARENTHESIS
                        ;

float_constant          : FLOAT_DEC_CONSTANT                                           # FloatDecimalConstant
                        | FLOAT_HEX_CONSTANT                                           # FloatHexadecimalConstant
                        | FLOAT_OCT_CONSTANT                                           # FloatOctalConstant
                        | FLOAT_BIN_CONSTANT                                           # FloatBinaryConstant
                        ;

statements              : statements labeled_statement                                 # ListOfLabeledStatements
                        | labeled_statement                                            # LabeledStatementEndCondition
                        ;

labeled_statement       : label statement                                              # LabeledStatement
                        | statement                                                    # NormalStatement
                        ;

label                   : INTEGER_DEC_CONSTANT                                         # IntegerDecimalLabel
                        | INTEGER_HEX_CONSTANT                                         # IntegerHexadecimalLabel
                        | INTEGER_OCT_CONSTANT                                         # IntegerOctalLabel
                        | INTEGER_BIN_CONSTANT                                         # IntegerBinaryLabel
                        ;

statement               : simple_statement                                             # SimpleStatement
                        | compound_statement                                           # CompoundStatement
                        ;

simple_statement        : assignment                                                   # AssignmentStatement
                        | goto_statement                                               # GoToStatement
                        | if_statement                                                 # IfStatement
                        | subroutine_call                                              # SubroutineStatement
                        | io_statement                                                 # IOStatement
                        | CONTINUE                                                     # ContinueStatement
                        | RETURN                                                       # ReturnStatement
                        | STOP                                                         # StopStatement
                        ;

assignment              : variable ASSIGN expression
                        ;

variable                : IDENTIFIER LEFT_PARENTHESIS expressions RIGHT_PARENTHESIS     # ListVariable
                        | LISTFUNC LEFT_PARENTHESIS expression RIGHT_PARENTHESIS        # ListFunctionVariable
                        | IDENTIFIER                                                    # IdentifierVariable
                        ;

expressions             : expressions COMMA expression                                    # ListOfExpressions
                        | expression                                                      # ExpressionEndCondition
                        ;

expression              : expression OROP expression                                      # OrOperation
                        | expression ANDOP expression                                     # AndOperation
                        | expression RELOP expression                                     # RelativeOperation
                        | expression POWEROP expression                                   # PowerOperation
                        | expression MULOP expression                                     # MultiplicationOperation
                        | expression DIVOP expression                                     # DivisionOperation
                        | expression ADDOP expression                                     # AdditionOperation
                        | NOTOP expression                                                # NotOperation
                        | ADDOP expression                                                # SignedOperation
                        | variable                                                        # VariableOperation
                        | simple_constant                                                 # SimpleConstantOperation
                        | LENGTH LEFT_PARENTHESIS expression RIGHT_PARENTHESIS            # LengthOperation
                        | NEW LEFT_PARENTHESIS expression RIGHT_PARENTHESIS               # NewOperation
                        | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS                   # ParenthesizedOperation
                        | LEFT_PARENTHESIS expression COLON expression RIGHT_PARENTHESIS  # ColonizedOperation
                        | listexpression                                                  # ListOperation
                        ;

listexpression          : LBRACK expressions RBRACK                                       # ListExpression
                        | LBRACK RBRACK                                                   # EmptyListExpression
                        ;

goto_statement          : GOTO label                                                      # NormalGoToStatement
                        | GOTO IDENTIFIER COMMA LEFT_PARENTHESIS labels RIGHT_PARENTHESIS # MultipleGoToStatement
                        ;

labels                  : labels COMMA label                                              # ListOfLabels
                        | label                                                           # LabelEndCondition
                        ;

if_statement            : IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS label COMMA label COMMA label # LogicalIfStatement
                        | IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS simple_statement              # ArithmeticIfStatement
                        ;

subroutine_call         : CALL variable                                                     # SubroutineCall
                        ;

io_statement            : READ read_list                                                    # ReadStatement
                        | WRITE write_list                                                  # WriteStatement
                        ;

read_list               : read_list COMMA read_item                                         # ListOfReadItems
                        | read_item                                                         # ReadItemEndCondition
                        ;

read_item               : variable                                                                          # VariableReadItem
                        | LEFT_PARENTHESIS read_list COMMA IDENTIFIER ASSIGN iter_space RIGHT_PARENTHESIS   # ImplicitLoopReadItem
                        ;

iter_space              : expression COMMA expression step                                   # IterationSpace
                        ;

step                    : COMMA expression                                                   # NormalStep
                        |                                                                    # EmptyStep
                        ;

write_list              : write_list COMMA write_item                                        # ListOfWriteItems
                        | write_item                                                         # WriteItemEndCondition
                        ;

write_item              : expression                                                                        # ExpressionWriteItem
                        | LEFT_PARENTHESIS write_list COMMA IDENTIFIER ASSIGN iter_space RIGHT_PARENTHESIS  # ImplicitLoopWriteItem
                        ;

compound_statement      : branch_statement                                                    # BranchStatement
                        | loop_statement                                                      # LoopStatement
                        ;

branch_statement        : IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS THEN body tail
                        ;

tail                    : ELSE body ENDIF                                                     # ElseTail
                        | ENDIF                                                               # NoTail
                        ;

loop_statement          : DO IDENTIFIER ASSIGN iter_space body ENDDO
                        ;

subprograms             : subprograms subprogram                                               # ListOfSubprograms
                        |                                                                      # SubprogramEndCondition
                        ;

subprogram              : header body END
                        ;

header                  : type listspec FUNCTION IDENTIFIER LEFT_PARENTHESIS formal_parameters RIGHT_PARENTHESIS    # NormalFunctionHeader
                        | SUBROUTINE IDENTIFIER LEFT_PARENTHESIS formal_parameters RIGHT_PARENTHESIS                # ListSubroutineHeader
                        | SUBROUTINE IDENTIFIER                                                                     # NormalSubroutineHeader
                        ;

formal_parameters       : type variables COMMA formal_parameters                                # ListOfFormalParameters
                        | type variables                                                        # FormalParametersEndCondition
                        ;


/* Lexer Rules */

fragment A              : ('A' | 'a');
fragment B              : ('B' | 'b');
fragment C              : ('C' | 'c');
fragment D              : ('D' | 'd');
fragment E              : ('E' | 'e');
fragment F              : ('F' | 'f');
fragment G              : ('G' | 'g');
fragment H              : ('H' | 'h');
fragment I              : ('I' | 'i');
fragment J              : ('J' | 'j');
fragment K              : ('K' | 'k');
fragment L              : ('L' | 'l');
fragment M              : ('M' | 'm');
fragment N              : ('N' | 'n');
fragment O              : ('O' | 'o');
fragment P              : ('P' | 'p');
fragment Q              : ('Q' | 'q');
fragment R              : ('R' | 'r');
fragment S              : ('S' | 's');
fragment T              : ('T' | 't');
fragment U              : ('U' | 'u');
fragment V              : ('V' | 'v');
fragment W              : ('W' | 'w');
fragment X              : ('X' | 'x');
fragment Y              : ('Y' | 'y');
fragment Z              : ('Z' | 'z');
fragment SIGN           : ('-' | '+');
fragment ZERO           : '0';
fragment DOT            : '.';
fragment UNDERSCORE     : '_';
fragment APOSTROPHE     : '\'';
fragment QUOTATION_MARK : '"';
fragment BACKSLASH      : '\\';
fragment COMMENT_START  : '$';
fragment HEX_INDICATOR  : ZERO X;
fragment OCT_INDICATOR  : ZERO O;
fragment BIN_INDICATOR  : ZERO B;
fragment VALID_BIN_NUM  : '1' [01]*;
fragment VALID_OCT_NUM  : [1-7] [0-7]*;
fragment VALID_HEX_NUM  : (NON_ZERO_DIGIT | A | B | C | E | D | F) (DIGIT | A | B | C | E | D | F)*;
fragment LOWERCASE      : [a-z];
fragment UPPERCASE      : [A-Z];
fragment LETTER         : [A-Za-z];
fragment DIGIT          : [0-9];
fragment NON_ZERO_DIGIT : [1-9];

COMMA                   : ',';
LEFT_PARENTHESIS        : '(';
RIGHT_PARENTHESIS       : ')';
LBRACK                  : '[';
RBRACK                  : ']';
ASSIGN                  : '=';
COLON                   : ':';
ADDOP                   : '+';
SUBOP                   : '-';
MULOP                   : '*';
DIVOP                   : '/';
POWEROP                 : '**';

OROP                    : DOT  O R  DOT;
ANDOP                   : DOT  A N D  DOT;
NOTOP                   : DOT  N O T  DOT;
RELOP                   : DOT  G T  DOT
                        | DOT  G E  DOT
                        | DOT  L T  DOT
                        | DOT  L E  DOT
                        | DOT  E Q  DOT
                        | DOT  N E  DOT
                        ;

INT_TYPE                : I N T;
FLOAT_TYPE              : F L O A T;
BOOL_TYPE               : B O O L;
TRUE                    : DOT  T R U E  DOT;
FALSE                   : DOT  F A L S E  DOT;

IF                      : I F;
FUNCTION                : F U N C T I O N;
SUBROUTINE              : S U B R O U T I N E;
END                     : E N D;
COMMON                  : C O M M O N;
INTEGER                 : I N T E G E R;
REAL                    : R E A L;
COMPLEX                 : C O M P L E X;
LOGICAL                 : L O G I C A L;
CHARACTER               : C H A R A C T E R;
STRING                  : S T R I N G;
LIST                    : L I S T;
DATA                    : D A T A;
CONTINUE                : C O N T I N U E;
GOTO                    : G O T O;
CALL                    : C A L L;
READ                    : R E A D;
WRITE                   : W R I T E;
LENGTH                  : L E N G T H;
NEW                     : N E W;
THEN                    : T H E N;
ELSE                    : E L S E;
ENDIF                   : E N D I F;
DO                      : D O;
ENDDO                   : E N D D O;
STOP                    : S T O P;
RETURN                  : R E T U R N;



LISTFUNC                : C ((A D*) | (D+)) R;



INTEGER_DEC_CONSTANT    : (ZERO | NON_ZERO_DIGIT+ DIGIT*);
INTEGER_HEX_CONSTANT    : HEX_INDICATOR VALID_HEX_NUM;
INTEGER_OCT_CONSTANT    : OCT_INDICATOR VALID_OCT_NUM;
INTEGER_BIN_CONSTANT    : BIN_INDICATOR VALID_BIN_NUM;

FLOAT_DEC_CONSTANT      : (
                                (NON_ZERO_DIGIT DIGIT* | ZERO)? DOT DIGIT* NON_ZERO_DIGIT DIGIT*         // ensures decimal part
                              | (NON_ZERO_DIGIT DIGIT* | ZERO) (DOT (DIGIT* NON_ZERO_DIGIT DIGIT*)?)?    // ensures int part
                          )
                          (E SIGN? INTEGER_DEC_CONSTANT)?
                        ;

FLOAT_HEX_CONSTANT      : HEX_INDICATOR
                          (
                                (ZERO | VALID_HEX_NUM)? DOT ZERO* VALID_HEX_NUM            // ensures decimal part
                             |  (ZERO | VALID_HEX_NUM) (DOT (ZERO* VALID_HEX_NUM)?)?       // ensures int part
                          )
                        ;

FLOAT_OCT_CONSTANT      : OCT_INDICATOR
                          (
                                (ZERO | VALID_HEX_NUM)? DOT ZERO* VALID_OCT_NUM            // ensures decimal part
                             |  (ZERO | VALID_HEX_NUM) (DOT (ZERO* VALID_OCT_NUM)?)?       // ensures int part
                          )
                        ;

FLOAT_BIN_CONSTANT      : BIN_INDICATOR
                          (
                                (ZERO | VALID_HEX_NUM)? DOT ZERO* VALID_BIN_NUM            // ensures decimal part
                             |  (ZERO | VALID_HEX_NUM) (DOT (ZERO* VALID_OCT_NUM)?)?       // ensures int part
                          )
                        ;

CCONST                  : APOSTROPHE ( ~[\\] | BACKSLASH 'v')+  APOSTROPHE;

SCONST                  : QUOTATION_MARK  (~[(] | '(')*  QUOTATION_MARK;

IDENTIFIER              : (LETTER)+ ((LETTER | DIGIT)* | (UNDERSCORE? ((LETTER | DIGIT)+ UNDERSCORE)*));

WHITESPACE              : [ \t\n\r] -> skip;
ONE_LINE_COMMENT        : COMMENT_START ~[\r\n]* -> skip;