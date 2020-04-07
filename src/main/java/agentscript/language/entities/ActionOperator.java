package agentscript.language.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ActionOperator {
    PLUS("+"),
    MINUS("-"),
    NONE("");


    @Getter
    private String value;
}
