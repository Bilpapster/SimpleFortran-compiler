grammar SimpleFortran2;

/* Parser rules */

program                 : body END subprograms EOF
                        ;

body                    : declarations statements
                        ;

declarations            : declarations type variables
                        | declarations COMMON cblock_list
                        | declarations DATA vals
                        |
                        ;

type                    : INTEGER
                        | REAL
                        | COMPLEX
                        | LOGICAL
                        | CHARACTER
                        | STRING
                        ;

variables               : variables COMMA undefined_variable
                        | undefined_variable;

undefined_variable      : listspec IDENTIFIER LEFT_PARENTHESIS dims RIGHT_PARENTHESIS
                        | listspec IDENTIFIER
                        ;

listspec                : LIST
                        |
                        ;

dims                    : dims COMMA dim
                        | dim
                        ;

//dim                     : ICONST | IDENTIFIER
dim                     : INTEGER_DEC_CONSTANT
                        | INTEGER_HEX_CONSTANT
                        | INTEGER_OCT_CONSTANT
                        | INTEGER_BIN_CONSTANT
                        | IDENTIFIER
                        ;

cblock_list             : cblock_list cblock
                        | cblock
                        ;

cblock                  : DIVOP IDENTIFIER DIVOP identifier_list
                        ;

identifier_list         : identifier_list COMMA IDENTIFIER
                        | IDENTIFIER
                        ;

vals                    : vals COMMA IDENTIFIER value_list
                        | IDENTIFIER value_list
                        ;

value_list              : DIVOP values DIVOP;

values                  : values COMMA value
                        | value
                        ;

value                   : repeat sign constant
                        | ADDOP constant
                        | constant
                        ;

//repeat                  : ICONST MULOP
repeat                  : (
                              INTEGER_DEC_CONSTANT
                            | INTEGER_HEX_CONSTANT
                            | INTEGER_OCT_CONSTANT
                            | INTEGER_BIN_CONSTANT
                          )?
                          MULOP
                        ;

sign                    : ADDOP
                        | SUBOP
                        |
                        ;

constant                : simple_constant
                        | complex_constant
                        ;

//simple_constant         : ICONST | RCONST | LCONST | CCONST | SCONST
simple_constant         : INTEGER_DEC_CONSTANT
                        | INTEGER_HEX_CONSTANT
                        | INTEGER_OCT_CONSTANT
                        | INTEGER_BIN_CONSTANT
                        | FLOAT_DEC_CONSTANT
                        | FLOAT_HEX_CONSTANT
                        | FLOAT_OCT_CONSTANT
                        | FLOAT_BIN_CONSTANT
//                        | RCONST
                        | TRUE
                        | FALSE
                        | CCONST
                        | SCONST
                        ;

//complex_constant        : LEFT_PARENTHESIS RCONST COLON sign RCONST RIGHT_PARENTHESIS
complex_constant        : LEFT_PARENTHESIS (FLOAT_DEC_CONSTANT | FLOAT_HEX_CONSTANT | FLOAT_OCT_CONSTANT | FLOAT_BIN_CONSTANT)
                          COLON sign (FLOAT_DEC_CONSTANT | FLOAT_HEX_CONSTANT | FLOAT_OCT_CONSTANT | FLOAT_BIN_CONSTANT)  RIGHT_PARENTHESIS
                        ;

statements              : statements labeled_statement
                        | labeled_statement
                        ;

labeled_statement       : label statement
                        | statement
                        ;

//label                   : ICONST;
label                   : INTEGER_DEC_CONSTANT
                        | INTEGER_HEX_CONSTANT
                        | INTEGER_OCT_CONSTANT
                        | INTEGER_BIN_CONSTANT
                        ;

statement               : simple_statement
                        | compound_statement
                        ;

simple_statement        : assignment
                        | goto_statement
                        | if_statement
                        | subroutine_call
                        | io_statement
                        | CONTINUE
                        | RETURN
                        | STOP
                        ;

assignment              : variable ASSIGN expression
                        ;

variable                : IDENTIFIER LEFT_PARENTHESIS expressions RIGHT_PARENTHESIS
                        | LISTFUNC LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
                        | IDENTIFIER
                        ;

expressions             : expressions COMMA expression
                        | expression
                        ;

expression              : expression OROP expression
                        | expression ANDOP expression
                        | expression RELOP expression
                        | expression ADDOP expression
                        | expression MULOP expression
                        | expression DIVOP expression
                        | expression POWEROP expression
                        | NOTOP expression
                        | ADDOP expression
                        | variable
                        | simple_constant
                        | LENGTH LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
                        | NEW LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
                        | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
                        | LEFT_PARENTHESIS expression COLON expression RIGHT_PARENTHESIS
                        | listexpression
                        ;

listexpression          : LBRACK expressions RBRACK
                        | LBRACK RBRACK
                        ;

goto_statement          : GOTO label
                        | GOTO IDENTIFIER COMMA LEFT_PARENTHESIS labels RIGHT_PARENTHESIS
                        ;

labels                  : labels COMMA label
                        | label
                        ;

if_statement            : IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS label COMMA label COMMA label
                        | IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS simple_statement
                        ;

subroutine_call         : CALL variable
                        ;

io_statement            : READ read_list
                        | WRITE write_list
                        ;

read_list               : read_list COMMA read_item
                        | read_item
                        ;

read_item               : variable
                        | LEFT_PARENTHESIS read_list COMMA IDENTIFIER ASSIGN iter_space RIGHT_PARENTHESIS
                        ;

iter_space              : expression COMMA expression step
                        ;

step                    : COMMA expression
                        |
                        ;

write_list              : write_list COMMA write_item
                        | write_item
                        ;

write_item              : expression
                        | LEFT_PARENTHESIS write_list COMMA IDENTIFIER ASSIGN iter_space RIGHT_PARENTHESIS
                        ;

compound_statement      : branch_statement
                        | loop_statement
                        ;

branch_statement        : IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS THEN body tail
                        ;

tail                    : ELSE body ENDIF
                        | ENDIF
                        ;

loop_statement          : DO IDENTIFIER ASSIGN iter_space body ENDDO
                        ;

subprograms             : subprograms subprogram
                        |
                        ;

subprogram              : header body END
                        ;

header                  : type listspec FUNCTION IDENTIFIER LEFT_PARENTHESIS formal_parameters RIGHT_PARENTHESIS
                        | SUBROUTINE IDENTIFIER LEFT_PARENTHESIS formal_parameters RIGHT_PARENTHESIS
                        | SUBROUTINE IDENTIFIER
                        ;

formal_parameters       : type variables COMMA formal_parameters
                        | type variables
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

INT_TYPE                : I N T;
FLOAT_TYPE              : F L O A T;
BOOL_TYPE               : B O O L;
STRING_TYPE             : S T R I N G;
TRUE                    : DOT  T R U E  DOT;
FALSE                   : DOT  F A L S E  DOT;

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
IF                      : I F;
THEN                    : T H E N;
ELSE                    : E L S E;
ENDIF                   : E N D I F;
DO                      : D O;
ENDDO                   : E N D D O;
STOP                    : S T O P;
RETURN                  : R E T U R N;

COMMA                   : ',';
LEFT_PARENTHESIS        : '(';
RIGHT_PARENTHESIS       : ')';
LBRACK                  : '[';
RBRACK                  : ']';

OROP                    : '.OR.';
ANDOP                   : '.AND.';
NOTOP                   : '.NOT.';
RELOP                   : '.GT.'
                        | '.GE.'
                        | '.LT.'
                        | '.LE.'
                        | '.EQ.'
                        | '.NE.'
                        ;

ADDOP                   : '+';
SUBOP                   : '-';
MULOP                   : '*';
DIVOP                   : '/';
POWEROP                 : '**';

LISTFUNC                : C ((A D*) | (D+)) R;

ASSIGN                  : '=';
COLON                   : ':';


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

SCONST                  : QUOTATION_MARK  (~[\r\n])  QUOTATION_MARK; // TODO: REGEX FOR STRING CONSTANT

IDENTIFIER              : (LETTER)+ ((LETTER | DIGIT)* | (UNDERSCORE? ((LETTER | DIGIT)+ UNDERSCORE)*));

WHITESPACE              : [ \t\n\r] -> skip;
ONE_LINE_COMMENT        : COMMENT_START ~[\r\n]* -> skip;