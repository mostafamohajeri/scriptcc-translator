grammar AgentScript2;

// --- agent-script structure ---------------------------------------------------------

script :
    (
      ( initialbelief | initialgoal | reactiverule | inferentialrule )
    )+
    ;

initialbelief:
    belief
    DOT
    ;

initialgoal:
    ( proceduralgoal | achievementgoal | maintenancegoal  )
    DOT
    ;

// --- main components ---------------------------------------------------------

belief:
    neg_literal
;

ext_belief:
    naf_literal
;

testgoal :
    QUESTIONMARK neg_literal
;

proceduralgoal :
    EXCLAMATIONMARK AT pos_literal
;

achievementgoal :
    EXCLAMATIONMARK neg_literal
;

maintenancegoal :
    DOUBLEEXCLAMATIONMARK neg_literal
;

//-- reactive rules: goal-plan and percept-plan rules

reactiverule :
    // ANNOTATION*  // TODO: annotations are the last things that will be added (if ever)
    trigger
    ( COLON condition = expression )?
    ( LEFTARROWDOUBLE | RIGHTARROWDOUBLE )
    planbody
    DOT
    ;

trigger :
    EVENTOPERATOR
    ( belief | proceduralgoal | achievementgoal | maintenancegoal )
    ;

planbody :
    ( instruction SEMICOLON )*
    instruction
    ;

instruction :
    for_loop
    | if_else
    | primitiveaction
    | instruction1
    | instruction2
    | EVENTVALUE
    | assignment
    ;

instruction1:
    EVENTOPERATOR // TODO: took out the +- expression, it is confusing
    (belief | maintenancegoal)
;

instruction2:
    (EVENTOPERATOR)? // TODO: to consider the parallel activation
    (proceduralgoal | achievementgoal | testgoal)
;

primitiveaction :
    HASH primitiveinvokation
    | PRIMITIVECODE
;

primitiveinvokation :
    (
      (LOWERCASEATOM (termlist)? | HIGHERCASEATOM) DOT
    )?   // TODO: not sure we need this, or we should rather use primitive code for complex calls.
    LOWERCASEATOM (termlist)?   // TODO: I constrain parameters to terms here. why we need more of them?
;

//-- transformational rules, e.g. inferential

inferentialrule :
    ( belief )?
    ( RULEOPERATOR ext_belief (COMMA ext_belief)* )+
    DOT
    ;

// --- basic control structures ---------------------------------------------------------------

for_loop :
    FOR LEFTROUNDBRACKET variable IN expression RIGHTROUNDBRACKET
    LEFTCURVEDBRACKET
    (instruction SEMICOLON)*
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
         (LEFTCURVEDBRACKET (instruction SEMICOLON)* RIGHTCURVEDBRACKET)
         |
         single=instruction SEMICOLON
    )
;

expression :
    lhs=expression binaryoperator=AS rhs=expression  // TODO: what it is?
    | lhs=expression binaryoperator=ARITHMETICBINARYOPERATOR1 rhs=expression
    | lhs=expression binaryoperator=ARITHMETICBINARYOPERATOR2 rhs=expression
    | lhs=expression binaryoperator=ARITHMETICBINARYOPERATOR3 rhs=expression
    | lhs=expression binaryoperator=ASSIGNOPERATOR rhs=expression
    | lhs=expression binaryoperator=RELATIONALOPERATOR rhs=expression
    // | lhs=expression binaryoperator=OBJECT_REF rhs=expression // TODO: what it is?
    | lhs=expression binaryoperator=RETURNS rhs=expression  // TODO: what it is?
    | DEFAULTNEGATION single=expression  // TODO: why here?
    | lhs=expression binaryoperator=LOGICALOPERATOR1 rhs=expression
    | lhs=expression binaryoperator=LOGICALOPERATOR2 rhs=expression
    | lhs=expression binaryoperator=LOGICALOPERATOR3 rhs=expression
    | LEFTROUNDBRACKET single=expression RIGHTROUNDBRACKET  // TODO: what it is?
    | term
    ;

assignment :
    variable (ASSIGNOPERATOR) term
;


// --- term elements ---------------------------------------------------------------

term :
    neg_literal
    | variable
    | constant
    | primitiveaction
    ;

naf_literal :
    ( DEFAULTNEGATION )?
    neg_literal
    ;

neg_literal :
    ( STRONGNEGATION )?
    pos_literal
    ;

pos_literal :
    LOWERCASEATOM
    termlist?
    ;

termlist :
    LEFTROUNDBRACKET term ( COMMA term )* RIGHTROUNDBRACKET
    ;

variable :
    HIGHERCASEATOM
    ;

constant :
    LOGICALVALUE
    | EVENTVALUE
    | NUMBER
    | STRING
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

EVENTVALUE:
    SUCCESS
    | FAIL
;

NUMBER :
    MINUS? DIGITSEQUENCE
;

STRING :
    SINGLEQUOTESTRING
    | DOUBLEQUOTESTRING
    ;

PRIMITIVECODE : '#{' .*? '}#';

// --- operators must be second rules---------------------------------------------------------------------------------------------------------------------------

STRONGNEGATION : '~';
DEFAULTNEGATION : 'not';

RETURNS    : 'returns';
OBJECT_REF : LEFTARROW;
AS : 'as';

EVENTOPERATOR:
    PLUS
    | MINUS
    ;


LOGICALOPERATOR1 : // TODO: check whether XOR should have higher precedence on AND...
    XOR
    ;

LOGICALOPERATOR2 :
    AND
    ;

LOGICALOPERATOR3 :
    OR
    ;

ARITHMETICBINARYOPERATOR1 :
    POW
    ;

ARITHMETICBINARYOPERATOR2 :
    MULTIPLY
    | DIVIDE
    | MODULO
    ;

ARITHMETICBINARYOPERATOR3 :
    PLUS
    | MINUS
    ;

ARITHMETICUNARYOPERATOR :
    INCREMENT
    | DECREMENT
    ;

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

// --- base structure ---------------------------------------------------------------------------------------------------------------------------

HIGHERCASEATOM :
    ( UPPERCASELETTER | UNDERSCORE )
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | SLASH )*
;

LOWERCASEATOM :
    LOWERCASELETTER
    ( LOWERCASELETTER | UPPERCASELETTER | DIGIT | SLASH | MINUS | UNDERSCORE )*
;

// for the underlying language



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
LEFTARROWDOUBLE            : '<=';
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
fragment DIVIDE            : '/'; // TODO: check, I returned to the more usual syntax

fragment AND               : '&&' ;
fragment OR                : '||' ;
fragment XOR               : '^' ;

fragment TRUE              : 'true' ;
fragment FALSE             : 'false' ;
fragment SUCCESS           : 'success' ;
fragment FAIL              : 'fail' ;

DECONSTRUCT                : '=..';  // TODO: PROLOG like component. to be taken out?
fragment IS                : 'is';   // TODO: PROLOG like component. to be taken out?

fragment ASSIGN            : '=';
fragment ASSIGNINCREMENT   : '+=';
fragment ASSIGNDECREMENT   : '-=';
fragment ASSIGNMULTIPLY    : '*=';
fragment ASSIGNDIVIDE      : '/=';
fragment ASSIGNMODULO      : '%=';
fragment ASSIGNPOW         : '^=';
fragment INCREMENT         : '++';
fragment DECREMENT         : '--';
fragment LESS              : '<';
fragment LESSEQUAL         : '=<';
fragment GREATER           : '>';
fragment GREATEREQUAL      : '>=';
fragment EQUAL             : '==';
fragment NOTEQUAL          : '!=='; // TODO: PROLOG like component. to be taken out?
fragment NOTUNIFIABLE      : '!=';  // TODO: PROLOG like component. to be taken out?
fragment POW               : '**';
fragment MULTIPLY          : '*';
fragment MODULO            : '%' | 'mod';

fragment SINGLEQUOTESTRING : '\'' ~('\'')* '\'';
fragment DOUBLEQUOTESTRING : '"' ~('"')* '"';

fragment LOWERCASELETTER   : [a-z];
fragment UPPERCASELETTER   : [A-Z];
fragment DIGIT             : [0-9];
fragment DIGITSEQUENCE     : DIGIT+ ('.' DIGIT+)?;

// --- skip items ----------------------------------------------------------------------------------------------------------------------------------------------

WHITESPACE                 : (' ' | '\n' | '\t' | '\r')+ -> skip;
LINECOMMENT                : '//' .*? '\r'? '\n' -> skip;
BLOCKCOMMENT               : '/*' .*? '*/' -> skip;