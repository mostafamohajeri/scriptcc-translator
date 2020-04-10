package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialBelief {
    Literal literal;
}
