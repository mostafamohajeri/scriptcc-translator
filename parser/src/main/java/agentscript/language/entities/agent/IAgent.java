package agentscript.language.entities.agent;

import agentscript.language.entities.InitialBelief;
import agentscript.language.entities.Plan;
import agentscript.language.entities.goals.GoalPlan;

public interface IAgent {
    java.util.List<InitialBelief> getInitialBeliefs();

    java.util.List<agentscript.language.entities.goals.InitialGoal> getInitialGoals();

    java.util.List<GoalPlan> getGoalPlans();
    java.util.List<Plan> getPlans();
}
