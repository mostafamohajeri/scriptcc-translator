package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class Variable extends Term {
    String name;
    public String getValue() { return this.name; }
}
