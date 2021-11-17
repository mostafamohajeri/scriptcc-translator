package agentscript.language.entities.terms;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter @EqualsAndHashCode
@AllArgsConstructor(staticName = "from")
public class Atom {
    String name;
}
