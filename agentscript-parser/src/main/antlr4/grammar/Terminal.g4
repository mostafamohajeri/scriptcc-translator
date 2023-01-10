lexer grammar Terminal;

// --- keyword rules must be first rules -----------------------------------------------------------------------------------------------------------------------

FOR                        : 'for';
IF                        : 'if';
ELIF                        : 'elif';
ELSE                        : 'else';
IN                         : 'in';

LOGICALVALUE :
    TRUE
    | FALSE
;

NUMBER :
    MINUS?
    ( CONSTANTNUMBER | DIGITSEQUENCE )
;

/**
 * floating-point constants
 */
CONSTANTNUMBER :
    PI
    | EULER
    | GRAVITY
    | AVOGADRO
    | BOLTZMANN
    | ELECTRON
    | PROTON
    | NEUTRON
    | LIGHTSPEED
    | POSITIVEINFINITY
    | NEGATIVEINFINITY
    | MAXIMUMVALUE
    | MINIMUMVALUE
    | NAN
    ;

/**
 * string define with single or double quotes
 */
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
    | PREFERRED
    ;

ASSIGNOPERATOR :
    ASSIGN
    ;

/**
 * assign operator
 */
//ASSIGNOPERATOR :
//    ASSIGN
//    | ASSIGNINCREMENT
//    | ASSIGNDECREMENT
//    | ASSIGNMULTIPLY
//    | ASSIGNDIVIDE
//    | ASSIGNMODULO
//    | ASSIGNPOW
//    ;

/**
 * logical operator with precendece 1
 */
LOGICALOPERATOR1 :
    XOR
    ;

/**
 * logical operator with precendece 2
 */
LOGICALOPERATOR2 :
    AND
    ;

/**
 * logical operator with precendece 3
 */
LOGICALOPERATOR3 :
    OR
    ;

/**
 * arithmetic operator with precendece 1
 */
ARITHMETICOPERATOR1 :
    POW
    ;

/**
 * arithmetic operator with precendece 2
 */
ARITHMETICOPERATOR2 :
    MULTIPLY
    | DIVIDE
    | MODULO
    ;

/**
 * arithmetic operator with precendece 3
 * @warning is also used for the belieftrigger
 */
ARITHMETICOPERATOR3 :
    PLUS
    | MINUS
    ;



/**
 * unary operator
 */
UNARYOPERATOR :
    INCREMENT
    | DECREMENT
    ;



// --- annotation and base structure ---------------------------------------------------------------------------------------------------------------------------

/**
 * annotation for rules and plans
 */
ANNOTATION :
    AT
    (
        ANNOTATION_CONSTANT
        | ANNOTATION_VARIABLEDESCRIPTION
        | ANNOTATION_STRING
        | PARALLEL
        | ATOMIC
        | PREFERENCES
    )
    ;

/**
 * annotation with string value
 */
ANNOTATION_STRING :
    ( DESCRIPTION | TAG )
    LEFTROUNDBRACKET
    STRING
    RIGHTROUNDBRACKET
    ;

/**
 * variable description annotation
 */
ANNOTATION_VARIABLEDESCRIPTION :
    VARIABLE
    LEFTROUNDBRACKET
    VARIABLEATOM
    COMMA
    STRING
    RIGHTROUNDBRACKET
    ;

/**
 * constant annotation
 */
ANNOTATION_CONSTANT :
    CONSTANT
    LEFTROUNDBRACKET
    VARIABLEATOM
    COMMA
    ( NUMBER | STRING )
    RIGHTROUNDBRACKET
    ;

/**
 * name structure of a variable
 */




VARIABLEATOM :
    ( UPPERCASELETTER | UNDERSCORE )
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT )*
    ;

/**
 * atoms are defined like Prolog atoms
 */

FUNC_NAME :
      DOT (LOWERCASELETTER | UPPERCASELETTER)
      ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | UNDERSCORE )*
       ;


ATOM :
    LOWERCASELETTER
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | MINUS | UNDERSCORE )*
    ;



OBJECT_ATOM :
     HASH (ATOM | VARIABLEATOM)
     ;



/**
 * rule to represent the initial goal
 */
//INITIALGOAL :
//    EXCLAMATIONMARK
//    ATOM
//    DOT
//    ;



// --- character structures ------------------------------------------------------------------------------------------------------------------------------------

EXCLAMATIONMARK            : '!';
COMMA                      : ',';
DOUBLEEXCLAMATIONMARK      : '!!';
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
//SLASH                      : '/';
//LEFTSHIFT                  : '<<';
PREFERRED                 : '>>';

LEFTROUNDBRACKET           : '(';
RIGHTROUNDBRACKET          : ')';
LEFTANGULARBRACKET         : '[';
RIGHTANGULARBRACKET        : ']';
LEFTCURVEDBRACKET          : '{';
RIGHTCURVEDBRACKET         : '}';

fragment PLUS              : '+';
fragment MINUS             : '-';
fragment DIVIDE            : '/';

fragment PI                : 'pi';
fragment EULER             : 'euler';
fragment GRAVITY           : 'gravity';
fragment AVOGADRO          : 'avogadro';
fragment BOLTZMANN         : 'boltzmann';
fragment ELECTRON          : 'electron';
fragment PROTON            : 'proton';
fragment NEUTRON           : 'neutron';
fragment LIGHTSPEED        : 'lightspeed';
fragment POSITIVEINFINITY  : 'positiveinfinity';
fragment NEGATIVEINFINITY  : 'negativeinfinity';
fragment MAXIMUMVALUE      : 'maximumvalue';
fragment MINIMUMVALUE      : 'minimumvalue';
fragment NAN               : 'notanumber';

fragment AND               : '&&' ;
fragment OR                : '||' ;
fragment XOR               : '^' ;

fragment TRUE              : 'true' | 'success';
fragment FALSE             : 'false' | 'fail';


fragment CONSTANT          : 'constant';
fragment PARALLEL          : 'parallel';
fragment ATOMIC            : 'atomic';
fragment DESCRIPTION       : 'description';
fragment TAG               : 'tag';
fragment VARIABLE          : 'variable';
fragment PREFERENCES       : 'preferences';


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
/**
 * string can be definied in single- and double-quotes
 */
fragment SINGLEQUOTESTRING : '\'' ~('\'')* '\'';
fragment DOUBLEQUOTESTRING : '"' ~('"')* '"';

/**
 * char definitions
 */
fragment LOWERCASELETTER   : [a-z];
fragment UPPERCASELETTER   : [A-Z];
fragment DIGIT             : [0-9];
fragment DIGITSEQUENCE     : DIGIT+ ('.' DIGIT+)?;





// --- skip items ----------------------------------------------------------------------------------------------------------------------------------------------

/**
 * any whitespace
 */
WHITESPACE                 : (' ' | '\n' | '\t' | '\r')+ -> skip;
/**
 * add for line-comment also
 */
LINECOMMENT                : '//' .*? '\r'? '\n' -> skip;
/**
 * block comment allowed within the grammar
 * default behaviour does not allow block comments
 */
BLOCKCOMMENT                    :   '/*' .*? '*/' -> skip;