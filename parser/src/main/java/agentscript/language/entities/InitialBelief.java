package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialBelief {
    Literal literal;
}
