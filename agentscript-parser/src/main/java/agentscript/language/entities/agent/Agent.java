package agentscript.language.entities.agent;

import agentscript.language.entities.goals.GoalPlan;
import agentscript.language.entities.plan.Plan;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Agent implements IAgent {
    @Singular
    List<InitialBelief> initialBeliefs;
    @Singular
    List<InitialGoal> initialGoals;

    @Setter
    List<GoalPlan> goalPlans;

    @Singular
    List<Plan> plans;

    public void addGoalPlan(GoalPlan gp) {
        goalPlans.add(gp);
    }

}
