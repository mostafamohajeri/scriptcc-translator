package agentscript.language.entities.goals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialGoal {
    Goal goal;
}
