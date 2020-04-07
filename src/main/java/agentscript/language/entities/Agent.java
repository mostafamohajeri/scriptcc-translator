package agentscript.language.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Agent {
    @Singular List<InitialBelief> initialBeliefs;
    @Singular List<InitialGoal> initialGoals;
    @Singular List<Plan> plans;
}
