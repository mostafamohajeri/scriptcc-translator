grammar AgentScript2;

// --- agent-script structure ---------------------------------------------------------

script :
    initialbeliefs |
    initialgoals |
    reactiverules
    ;

initialbeliefs:
    belief+
    ;

initialgoals:
    initialgoal+
    ;

reactiverules:
    reactiverule+
    ;

// --- agent-behaviour structure ---------------------------------------------------------

belief :
    literal DOT
    ;

initialgoal :
    achievementgoal DOT
    ;

reactiverule :
    ANNOTATION*
    plantrigger
    literal
    ( COLON condition = expression )?
    plandefinition
    DOT
    ;

/**
 * plan trigger
 */
plantrigger :
    ( ARITHMETICOPERATOR3 )
    ( QUESTIONMARK | EXCLAMATIONMARK | DOUBLEEXCLAMATIONMARK )?
    ;

beliefactiontrigger :
    first=ARITHMETICOPERATOR3 (second=ARITHMETICOPERATOR3)?
    ;

plandefinition :
     RIGHTARROWDOUBLE planbody
    ;

planbody :
    (  planbodyformula SEMICOLON )*
    planbodyformula
    ;

/**
 * basic executable formula
 */


planbodyformula :
    for_loop
    | if_else
    | beliefaction
    | testgoal
    | achievementgoal
    | primitiveaction
    | assignment
    ;

expression :
    lhs=expression binaryoperator=AS rhs=expression
    | lhs=expression binaryoperator=ARITHMETICOPERATOR1 rhs=expression
    | lhs=expression binaryoperator=ARITHMETICOPERATOR2 rhs=expression
    | lhs=expression binaryoperator=ARITHMETICOPERATOR3 rhs=expression
    | lhs=expression binaryoperator=ASSIGNOPERATOR rhs=expression
    | lhs=expression binaryoperator=RELATIONALOPERATOR rhs=expression
    | lhs=expression binaryoperator=OBJECT_REF rhs=expression
    | lhs=expression binaryoperator=RETURNS rhs=expression
    | DEFAULTNEGATION single=expression
    | lhs=expression binaryoperator=LOGICALOPERATOR1 rhs=expression
    | lhs=expression binaryoperator=LOGICALOPERATOR2 rhs=expression
    | lhs=expression binaryoperator=LOGICALOPERATOR3 rhs=expression
    | LEFTROUNDBRACKET single=expression RIGHTROUNDBRACKET
    | term
    ;

assignment :
    variable (ASSIGNOPERATOR) term
;

beliefaction :
    beliefactiontrigger  literal
    ;

for_loop :
    FOR LEFTROUNDBRACKET variable IN expression RIGHTROUNDBRACKET
        LEFTCURVEDBRACKET
        (planbodyformula SEMICOLON)*
        RIGHTCURVEDBRACKET;

if_else :
     IF condition_block (ELSE IF condition_block)* (ELSE code_block)?
;

condition_block :
    LEFTROUNDBRACKET expression RIGHTROUNDBRACKET
    code_block
;

code_block :
    (
         (LEFTCURVEDBRACKET (planbodyformula SEMICOLON)* RIGHTCURVEDBRACKET)
         |
         single=planbodyformula SEMICOLON
    )
;

testgoal :
    ( QUESTIONMARK )
    ( literal  )
;

achievementgoal :
    ( EXCLAMATIONMARK )
    ( literal )
;

primitiveaction :
    OBJECT_ATOM paramlist? function_call*
;

function_call :
    FUNC_NAME paramlist?
;

// --- logic base elements ---------------------------------------------------------------

term :
    primitiveaction
    | termvalue
    | variable
    | literal
    ;

termvalue :
    LOGICALVALUE
    | NUMBER
    | STRING
    ;

literal :
    STRONGNEGATION?
    ATOM
    termlist?
    ;

termlist :
    LEFTROUNDBRACKET term ( COMMA term )* RIGHTROUNDBRACKET
    ;

paramlist :
    LEFTROUNDBRACKET (expression ( COMMA expression )*)? RIGHTROUNDBRACKET
    ;

variable :
    VARIABLEATOM
    ;

// --- keyword rules must be first rules -----------------------------------------------------------------------------------------------------------------------

FOR : 'for';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
IN : 'in';

LOGICALVALUE :
    TRUE
    | FALSE
;

NUMBER :
    MINUS? DIGITSEQUENCE
;


STRING :
    SINGLEQUOTESTRING
    | DOUBLEQUOTESTRING
    ;

// --- operators must be second rules---------------------------------------------------------------------------------------------------------------------------

STRONGNEGATION : '~';
DEFAULTNEGATION : 'not';

RETURNS    : 'returns';
OBJECT_REF : '<-';
AS : 'as';

RELATIONALOPERATOR :
    EQUAL
    | NOTEQUAL
    | NOTUNIFIABLE
    | LESS
    | LESSEQUAL
    | GREATER
    | GREATEREQUAL
    | IS
    ;

ASSIGNOPERATOR :
    ASSIGN
    ;

LOGICALOPERATOR1 :
    XOR
    ;

LOGICALOPERATOR2 :
    AND
    ;

LOGICALOPERATOR3 :
    OR
    ;

ARITHMETICOPERATOR1 :
    POW
    ;

ARITHMETICOPERATOR2 :
    MULTIPLY
    | DIVIDE
    | MODULO
    ;

ARITHMETICOPERATOR3 :
    PLUS
    | MINUS
    ;

UNARYOPERATOR :
    INCREMENT
    | DECREMENT
    ;

// --- annotation and base structure ---------------------------------------------------------------------------------------------------------------------------

ANNOTATION :
    AT
    (
        ANNOTATION_CONSTANT
        | ANNOTATION_VARIABLEDESCRIPTION
        | ANNOTATION_STRING
        | PARALLEL
        | ATOMIC
    )
    ;

ANNOTATION_STRING :
    ( DESCRIPTION | TAG )
    LEFTROUNDBRACKET
    STRING
    RIGHTROUNDBRACKET
    ;

ANNOTATION_VARIABLEDESCRIPTION :
    VARIABLE
    LEFTROUNDBRACKET
    VARIABLEATOM
    COMMA
    STRING
    RIGHTROUNDBRACKET
    ;

ANNOTATION_CONSTANT :
    CONSTANT
    LEFTROUNDBRACKET
    VARIABLEATOM
    COMMA
    ( NUMBER | STRING )
    RIGHTROUNDBRACKET
    ;

VARIABLEATOM :
    ( UPPERCASELETTER | UNDERSCORE )
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | SLASH )*
    ;

FUNC_NAME :
      DOT (LOWERCASELETTER | UPPERCASELETTER)
      ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | UNDERSCORE )*
       ;

ATOM :
    LOWERCASELETTER
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | SLASH | MINUS | UNDERSCORE )*
    ;

OBJECT_ATOM :
     HASH (ATOM | VARIABLEATOM)
     ;

// --- character structures ------------------------------------------------------------------------------------------------------------------------------------

DOUBLEEXCLAMATIONMARK      : '!!';
EXCLAMATIONMARK            : '!';
COMMA                      : ',';
QUESTIONMARK               : '?';
DOLLAR                     : '$';
VLINE                      : '|';
HASH                       : '#';

LEFTARROW                  : '<-';
RIGHTARROW                 : '->';
RIGHTARROWDOUBLE           : '=>';
RULEOPERATOR               : ':-';
AT                         : '@';
COLON                      : ':';
SEMICOLON                  : ';';
DOT                        : '.';
UNDERSCORE                 : '_';
SLASH                      : '/';
LEFTSHIFT                  : '<<';
RIGHTSHIFT                 : '>>';

LEFTROUNDBRACKET           : '(';
RIGHTROUNDBRACKET          : ')';
LEFTANGULARBRACKET         : '[';
RIGHTANGULARBRACKET        : ']';
LEFTCURVEDBRACKET          : '{';
RIGHTCURVEDBRACKET         : '}';

fragment PLUS              : '+';
fragment MINUS             : '-';
fragment DIVIDE            : '//';

fragment AND               : '&&' ;
fragment OR                : '||' ;
fragment XOR               : '^' ;

fragment TRUE              : 'true' | 'success';  // NOT THE SAME
fragment FALSE             : 'false' | 'fail';
fragment CONSTANT          : 'constant';
fragment PARALLEL          : 'parallel';
fragment ATOMIC            : 'atomic';
fragment DESCRIPTION       : 'description';
fragment TAG               : 'tag';
fragment VARIABLE          : 'variable';


DECONSTRUCT                : '=..';
fragment ASSIGN            : '=';
fragment ASSIGNINCREMENT   : '+=';
fragment ASSIGNDECREMENT   : '-=';
fragment ASSIGNMULTIPLY    : '*=';
fragment ASSIGNDIVIDE      : '//=';
fragment ASSIGNMODULO      : '%=';
fragment ASSIGNPOW         : '^=';
fragment INCREMENT         : '++';
fragment DECREMENT         : '--';
fragment LESS              : '<';
fragment LESSEQUAL         : '=<';
fragment GREATER           : '>';
fragment GREATEREQUAL      : '>=';
fragment EQUAL             : '==';
fragment NOTEQUAL          : '!==';
fragment NOTUNIFIABLE      : '!=';
fragment POW               : '**';
fragment MULTIPLY          : '*';
fragment MODULO            : '%' | 'mod';

fragment IS          : 'is';

fragment SINGLEQUOTESTRING : '\'' ~('\'')* '\'';
fragment DOUBLEQUOTESTRING : '"' ~('"')* '"';

fragment LOWERCASELETTER   : [a-z];
fragment UPPERCASELETTER   : [A-Z];
fragment DIGIT             : [0-9];
fragment DIGITSEQUENCE     : DIGIT+ ('.' DIGIT+)?;

// --- skip items ----------------------------------------------------------------------------------------------------------------------------------------------

WHITESPACE                 : (' ' | '\n' | '\t' | '\r')+ -> skip;
LINECOMMENT                : '//' .*? '\r'? '\n' -> skip;
BLOCKCOMMENT               :   '/*' .*? '*/' -> skip;