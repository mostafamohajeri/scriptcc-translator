package agentscript.language.entities.agent;

import agentscript.language.entities.terms.Literal;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialBelief {
    Literal literal;
}
