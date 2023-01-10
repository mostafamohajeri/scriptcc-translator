package agentscript.language.entities.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
public class PlanTrigger {
    @Getter
    ActionOperator actionOperator;
    @Getter
    PlanOperator planOperator;

    public boolean getAchievementGoalPlan() {
        return (this.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getPlanOperator().equals(PlanOperator.EXCLAMATION));
    }

    public boolean getAddBeliefPlan() {
        return (this.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getPlanOperator().equals(PlanOperator.NONE));
    }


    public boolean getAddUnBeliefPlan() {
        return (this.getActionOperator().equals(ActionOperator.MINUS) &&
                this.getPlanOperator().equals(PlanOperator.NONE));
    }

    public boolean getTestGoalPlan() {
        return (this.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getPlanOperator().equals(PlanOperator.QUESTION));
    }

    @Override
    public boolean equals(Object obj) {
        return this.actionOperator.equals(((PlanTrigger)obj).actionOperator) &&
                this.planOperator.equals(((PlanTrigger)obj).planOperator);
    }
}
