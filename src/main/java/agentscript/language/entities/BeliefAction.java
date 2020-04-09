package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class BeliefAction implements IPlanStep {
    ActionOperator actionOperator;
    Literal literal;

    public static BeliefAction empty() {
        return new BeliefAction();
    }

}
