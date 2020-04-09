package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class PrimitiveAction implements IPlanStep {
    Atom atom;
    List<Term> terms;

    public static PrimitiveAction empty() {
        return new PrimitiveAction();
    }
}
