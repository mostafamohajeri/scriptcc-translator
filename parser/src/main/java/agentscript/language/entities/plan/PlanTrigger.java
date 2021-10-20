package agentscript.language.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
public class PlanTrigger {
    @Getter
    ActionOperator actionOperator;
    @Getter
    PlanOperator planOperator;

    @Override
    public boolean equals(Object obj) {
        return this.actionOperator.equals(((PlanTrigger)obj).actionOperator) &&
                this.planOperator.equals(((PlanTrigger)obj).planOperator);
    }
}
