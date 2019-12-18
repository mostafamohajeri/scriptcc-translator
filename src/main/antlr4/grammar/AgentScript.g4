// AgentScript grammar
// ===================
// inspired by Jason/AgentSpeak(L), it is basically CL0 + "!" for goals

grammar AgentScript;

@header {}

/*----------------
* PARSER RULES
*----------------*/

/** The overall program consists of directives, facts and rules. */

program : (fact | constraint | mechanism | preference | operator )* EOF ;

///////////////////////////////////////////////////
// conditional preferences (inspired by CP-nets)
///////////////////////////////////////////////////
preference :
  procedural_goal_preference | achievement_goal_preference ;
procedural_goal_preference :
  ext_procedural_intent (GT | LT | EQ) ext_procedural_intent ( COLON list_ext_states ) ? DOT ;
achievement_goal_preference :
  achievement_intent (GT | LT | EQ) achievement_intent ( COLON list_ext_states ) ? DOT ;

//////////////////////////////////////
// constraints - inferential rules
//////////////////////////////////////

/** An inferential rule can be a conditional constraint or an absolute constraint. */
constraint : ( head ) ? ENTAILED_BY body DOT ;

/** The head consists of a literal */
head : belief ;

/** The body consists of a list of literals or expressions separated. */
body : list_ext_states ;

//////////////////////////////////////
// mechanisms - reactive rules
//////////////////////////////////////

/** a reactive rule is composed of a event, a condition and a consequence. */
mechanism : forward_mechanism | backward_mechanism ;
/** forward mechanisms are constraint-based rules */
forward_mechanism : transition ( COLON list_ext_states ) ? TRIGGERS list_transitions DOT ;
/** backward mechanisms are priority-based rules */
backward_mechanism : transition ( COLON list_ext_states ) ? LE list_transitions DOT ;

//////////////////////////////////////
// mechanisms - causal operators
//////////////////////////////////////

operator : outcome_operator | action_operator ;
outcome_operator : primitive_intent ( COLON list_ext_states ) ? EVENTUALLY_PRODUCES list_beliefs DOT ;
action_operator : primitive_intent ( COLON list_ext_states ) ? PRODUCES transition_formula DOT ;

//////////////////////////////////////
// facts
//////////////////////////////////////
fact : state DOT ;

//////////////////////////////////////
// constituents
//////////////////////////////////////

// content

/** A positive literal consists of symbols (no predicates) or symbols and terms (atom literal). */
pos_nom_literal : nominal_predicate ;   // ( LPAR list_parameters RPAR )? ;
pos_verb_literal : verbal_predicate ; // ( LPAR list_parameters RPAR )? ;

nom_literal : TILDE? pos_nom_literal ;
verb_literal : TILDE? pos_verb_literal ; // perhaps not useful
literal : nom_literal | verb_literal ;

// enriching content with modalities

belief : literal ;
ext_belief :  ( NOT )? belief ;

pos_achievement_intent : EXCLAMATION_MARK nom_literal ;
achievement_intent : ( TILDE )? pos_achievement_intent ; // perhaps not useful
ext_achievement_intent : ( NOT )? achievement_intent ;

pos_procedural_intent : EXCLAMATION_MARK pos_verb_literal | primitive_intent ;
primitive_intent : DIESIS pos_verb_literal ;
procedural_intent : ( TILDE )? pos_procedural_intent ; // perhaps not useful
ext_procedural_intent : ( NOT )? procedural_intent ;

pos_intent : pos_procedural_intent | pos_achievement_intent ;
intent : procedural_intent | achievement_intent ;
ext_intent : ext_procedural_intent | ext_achievement_intent ;

state : intent | belief ;
ext_state : ext_intent | ext_belief ;

transition : memory_control | intent_control | memory_query | LPAR transition_formula RPAR ;

memory_control : ( PLUS | MINUS ) belief ;
intent_control : ( PLUS | MINUS )? pos_intent ;
memory_query : QUESTION_MARK belief ; % or test_goals

//////////////////////////////////////
// lists
//////////////////////////////////////

list_beliefs : belief ( COMMA list_beliefs )? ;
list_states : state ( COMMA list_states )? ;
list_transitions : transition ( COMMA list_transitions )? ;
list_ext_states : ext_state ( COMMA list_ext_states )? ;
list_ext_state_expressions : ( ext_state | expression ) ( COMMA list_ext_state_expressions )? ;
list_memory_control : memory_control ( COMMA list_memory_control )? ;
// list_parameters :  parameter (COMMA list_parameters)? ;

//////////////////////////////////////
// expressions
//////////////////////////////////////

/** An expression is a boolean function operating variables and constants */
expression : ( identifier | variable | INTEGER | num_expression ) ( EQ | NEQ | LT | LE | GT | GE ) ( IDENTIFIER | VARIABLE | INTEGER | num_expression) ;

/** A numeric expression is an integer expression made by numeric variables and constants */
num_expression : (variable | INTEGER) (PLUS | MINUS) (variable | INTEGER) ;

//////////////////////////////////////
// EXTENSION FOR FORMULAS
//////////////////////////////////////

/** A state literal can be positive or negative. */
state_formula :
    state |
    state_formula state_operator state_formula |
    state_operator LPAR list_states RPAR ;

/** A state literal can be positive or negative. */
ext_state_formula :
    ext_state |
    ext_state state_operator ext_state |
    state_operator LPAR list_ext_states RPAR ;

state_operator :
    and_operator | or_operator | xor_operator ;
and_operator :
    COMMA | STAR | AMPERSAND | 'and' ;
or_operator :
    SEMICOLON /* | PLUS */ | PIPE | 'or' ;
xor_operator :
    POWER | 'xor' ;

/** A state literal can be positive or negative. */

transition_formula :
    transition (transition_operator transition)* |
    transition_operator LPAR list_transitions RPAR ;

transition_operator :
    seq_operator | par_operator | alt_operator | opt_operator ;
seq_operator :
    COMMA | STAR | AMPERSAND | 'seq' ;
par_operator :
    SEMICOLON /* | PLUS */ | PIPE | 'par' ;
alt_operator :
    POWER | 'alt' ;
opt_operator :
    'opt' ;

//////////////////////////////////////
// primitive constituents
//////////////////////////////////////

verbal_predicate : VERB_IDENTIFIER ;
nominal_predicate : IDENTIFIER ;
identifier : IDENTIFIER | VERB_IDENTIFIER ;
constant : INTEGER ;
variable : VARIABLE ;
string : STRING ;

// parameter : identifier | string | variable | (MINUS)? constant | state_literal | num_expression ;

/*----------------
* LEXER RULES
*----------------*/

WS : (' ' | '\t' | '\n' | '\r' | '\f')+ -> skip ;

ENTAILED_BY : ':-' ;
TRIGGERS : '=>' ;
PRODUCES : '/>' ;
EVENTUALLY_PRODUCES : '|>' ;

DOT : '.' ;
COMMA : ',' ;
SEMICOLON : ';' ;
COLON : ':' ;

LPAR : '(' ;
RPAR : ')' ;
LACC : '{' ;
RACC : '}' ;

EQ : '=' ;
NEQ : '!=' ;
GT : '>' ;
LT : '<' ;
GE : '>=' ;
LE : '<=' ;

PLUS : '+' ;  // both for addition event and arithmetic summation
MINUS : '-' ; // both for removal event and arithmetic deletion
NOT : 'not' ; // default negation
TILDE : '~' ; // for strong negation

DIESIS : '#' ;
STAR : '*' ;
AMPERSAND : '&' ;
PIPE : '|' ;
POWER : '^' ;

QUESTION_MARK : '?' ;
EXCLAMATION_MARK : '!' ;

INTEGER : '0' | [1-9] ([0-9])* ;
VERB_IDENTIFIER : [_a-z] ([0-9a-zA-Z_])* 'ing' ;
IDENTIFIER: [_a-z] ([0-9a-zA-Z_])* ;
VARIABLE: [A-Z] ([0-9a-zA-Z_])* ;
STRING: '"' ('\\"' | ~["\r\n])* '"' ;

// enabling C, Java and Prolog comment style.
SINGLE_LINE_COMMENT : ('//' | '%') ~('\n'|'\r')* -> channel(HIDDEN) ;
MULTILINE_COMMENT : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN) ;
