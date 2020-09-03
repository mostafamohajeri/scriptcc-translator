package agentscript.language.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PlanOperator {
    DOUBLEEXCLAMATION("!!"),
    EXCLAMATION("!"),
    QUESTION("?"),
    NONE("");

    @Getter
    private String value;

}
