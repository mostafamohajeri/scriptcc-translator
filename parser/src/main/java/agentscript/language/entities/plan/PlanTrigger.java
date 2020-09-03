package agentscript.language.entities.plan;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "from")
public class PlanTrigger {
    ActionOperator actionOperator;
    PlanOperator planOperator;
}
