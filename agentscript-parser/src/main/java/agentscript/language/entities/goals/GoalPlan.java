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
        return (this.trigger.getAchievementGoalPlan());
    }

    public boolean getHasHeadCheck() {
        return goal.getExpressions().size() != 0;
    }

    public String getHeadCheck() {
        if(goal.getExpressions().size() == 0) return "/* " + goal.getAsStructure() + " All vars no need to check */" ;

        return "StructTerm(\"most_preferred\" , Seq(StructTerm(\""+this.getNameWithArity() + "\", params.l_params)))";
    }

    public boolean getAddBeliefPlan() {
        return (this.trigger.getAddBeliefPlan());
    }

    public boolean getAddUnBeliefPlan() {
        return (this.trigger.getAddUnBeliefPlan());
    }

    public boolean getTestGoalPlan() {
        return (this.trigger.getTestGoalPlan());
    }

    public String getNameWithArity() {
        if(getAchievementGoalPlan())
            return "adopt_achievement_"+createName();
        else if (getAddBeliefPlan())
            return "adopt_belief_"+createName();
        else if (getAddUnBeliefPlan())
            return "adopt_unbelief_"+createName();
        else if(getTestGoalPlan())
            return "adopt_test_"+createName();

        return createName();
    }

    public boolean getHasPreferences() {
        return plans.stream().anyMatch(Plan::getPreferenceCheck);
    }

    private String createName() {
        return this.goal.getAtom().getName() +
                "_" +
                this.goal.getExpressions().size();
    }

}
