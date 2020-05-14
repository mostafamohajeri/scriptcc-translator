package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter @EqualsAndHashCode
@AllArgsConstructor(staticName = "from")
public class Atom {
    String name;
}
