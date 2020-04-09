package agentscript.language.entities.goals;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class InitialGoal extends Goal{
    Goal goal;
}
