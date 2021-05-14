grammar SimpleFortran;

/*
 * Parser rules
 */

program                : (variableDeclaration | expression)+ EOF
                       ;

variableDeclaration    : INT_TYPE IDENTIFIER '=' NUMBER          # Declaration
                       ;

expression             : expression '*' expression               # Multiplication
                       | expression '+' expression               # Addition
                       | IDENTIFIER                              # Variable
                       | NUMBER                                  # Number
                       ;

/*
 * Lexer rules
 */

fragment COMMENT_START : '$';
fragment UNDERSCORE    : '_';
fragment A             : ('A' | 'a');
fragment B             : ('B' | 'b');
fragment C             : ('C' | 'c');
fragment D             : ('D' | 'd');
fragment E             : ('E' | 'e');
fragment F             : ('F' | 'f');
fragment G             : ('G' | 'g');
fragment H             : ('H' | 'h');
fragment I             : ('I' | 'i');
fragment J             : ('J' | 'j');
fragment K             : ('K' | 'k');
fragment L             : ('L' | 'l');
fragment M             : ('M' | 'm');
fragment N             : ('N' | 'n');
fragment O             : ('O' | 'o');
fragment P             : ('P' | 'p');
fragment Q             : ('Q' | 'q');
fragment R             : ('R' | 'r');
fragment S             : ('S' | 's');
fragment T             : ('T' | 't');
fragment U             : ('U' | 'u');
fragment V             : ('V' | 'v');
fragment W             : ('W' | 'w');
fragment X             : ('X' | 'x');
fragment Y             : ('Y' | 'y');
fragment Z             : ('Z' | 'z');
fragment LOWERCASE     : [a-z];
fragment UPPERCASE     : [A-Z];
fragment DIGIT         : [0-9];
fragment NON_ZERO_DIGIT: [1-9];

INT_TYPE               : I N T;
IDENTIFIER             : (LOWERCASE | UPPERCASE)+ (LOWERCASE | UPPERCASE | DIGIT | UNDERSCORE)*;
NUMBER                 : ('0' | NON_ZERO_DIGIT+ DIGIT*);
WHITESPACE             : [ \t\n\r] -> skip;
ONE_LINE_COMMENT       : COMMENT_START ~[\r\n]* -> skip;


