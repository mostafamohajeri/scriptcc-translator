package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ExpressionOperator {
    POW("**"),
    MUL("*"),
    DIV("/"),
    MOD("%"),
    PLUS("+"),
    MINUS("-"),
    EQUAL("=="),
    NOTEQUAL("!="),
    LESS("<"),
    LESSEQUAL("<="),
    GREATER(">"),
    GREATEREQUAL(">="),
    XOR("^"),
    AND("&&"),
    OR("||"),
    ASSIGN("="),
    IS("is");

    @Getter
    private String value;
}