package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor(staticName = "from")
public class Variable extends Term {
    String name;
}
