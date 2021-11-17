package agentscript.language.entities.agent;

import agentscript.language.entities.plan.Plan;
import agentscript.language.entities.goals.GoalPlan;

public interface IAgent {
    java.util.List<InitialBelief> getInitialBeliefs();

    java.util.List<InitialGoal> getInitialGoals();

    java.util.List<GoalPlan> getGoalPlans();
    java.util.List<Plan> getPlans();
}
