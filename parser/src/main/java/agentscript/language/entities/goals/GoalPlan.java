package agentscript.language.entities.goals;

import agentscript.language.entities.plan.ActionOperator;
import agentscript.language.entities.plan.Plan;
import agentscript.language.entities.plan.PlanOperator;
import agentscript.language.entities.plan.PlanTrigger;
import agentscript.language.entities.terms.Literal;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor(staticName = "empty")
public class GoalPlan {



    Literal goal;
    List<Plan> plans;
    PlanTrigger trigger;


    public int getArity() {return this.goal.getExpressions().size();}
    public void addPlan(Plan p) {
        plans.add(p);
    }

    public boolean getAchievementGoalPlan() {
        return (this.trigger.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getTrigger().getPlanOperator().equals(PlanOperator.EXCLAMATION));
    }

    public boolean getAddBeliefPlan() {
        return (this.trigger.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getTrigger().getPlanOperator().equals(PlanOperator.NONE));
    }

    public boolean getTestGoalPlan() {
        return (this.trigger.getActionOperator().equals(ActionOperator.PLUS) &&
                this.getTrigger().getPlanOperator().equals(PlanOperator.QUESTION));
    }

    public String getNameWithArity() {
        if (getAddBeliefPlan())
            return "`+"+createName()+"`";
        else if(getTestGoalPlan())
            return "`+?"+createName()+"`";
        return createName();
    }



    private String createName() {
        return this.goal.getAtom().getName() +
                "_" +
                this.goal.getExpressions().size();
    }

}
