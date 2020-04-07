package agentscript.language.entities;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class InitialBelief {
    Literal literal;
}
