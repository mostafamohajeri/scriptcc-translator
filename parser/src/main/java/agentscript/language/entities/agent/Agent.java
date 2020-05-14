package agentscript.language.entities.agent;

import agentscript.language.entities.*;
import agentscript.language.entities.goals.GoalPlan;
import agentscript.language.entities.goals.InitialGoal;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

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
