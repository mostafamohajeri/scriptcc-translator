package agentscript.language.entities.agent;

import agentscript.language.entities.InitialBelief;
import agentscript.language.entities.Plan;
import agentscript.language.entities.goals.InitialGoal;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Builder
@Getter
public class Agent implements IAgent {
    @Singular
    List<InitialBelief> initialBeliefs = new CopyOnWriteArrayList<>();
    @Singular
    List<InitialGoal> initialGoals = new CopyOnWriteArrayList<>();
    @Singular
    List<Plan> plans = new CopyOnWriteArrayList<>();
}
