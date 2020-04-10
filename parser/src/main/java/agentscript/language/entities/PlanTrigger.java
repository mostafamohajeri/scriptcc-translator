package agentscript.language.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "from")
public class PlanTrigger {
    ActionOperator actionOperator;
    PlanOperator planOperator;
}
