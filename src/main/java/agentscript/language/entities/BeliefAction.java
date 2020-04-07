package agentscript.language.entities;

import lombok.Builder;
import lombok.Getter;

@Getter @Builder
public class BeliefAction {
    ActionOperator actionOperator;
    Literal literal;
}
