package agentscript.language.entities.agent;

import agentscript.language.entities.InitialBelief;
import agentscript.language.entities.Plan;

public interface IAgent {
    java.util.List<InitialBelief> getInitialBeliefs();

    java.util.List<agentscript.language.entities.goals.InitialGoal> getInitialGoals();

    java.util.List<Plan> getPlans();
}
