package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(staticName = "from")
public class PlanTrigger {
    ActionOperator actionOperator;
    PlanOperator planOperator;
}
