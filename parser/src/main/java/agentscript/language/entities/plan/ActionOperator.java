package agentscript.language.entities.plan;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ActionOperator {
    PLUS("+"),
    MINUS("-"),
    MINUSPLUS("-+"),
    NONE("");


    @Getter
    private String value;
}
