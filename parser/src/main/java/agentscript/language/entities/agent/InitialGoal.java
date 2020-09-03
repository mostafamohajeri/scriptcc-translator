package agentscript.language.entities.agent;

import agentscript.language.entities.goals.Goal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialGoal {
    Goal goal;
}
