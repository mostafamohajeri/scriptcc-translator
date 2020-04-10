package agentscript.language.entities;

import agentscript.language.entities.goals.InitialGoal;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Builder
@Getter
public class Agent {
    @Singular
    List<InitialBelief> initialBeliefs = new CopyOnWriteArrayList<>();
    @Singular
    List<InitialGoal> initialGoals = new CopyOnWriteArrayList<>();
    @Singular
    List<Plan> plans = new CopyOnWriteArrayList<>();
}
