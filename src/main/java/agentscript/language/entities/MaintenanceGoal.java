package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class MaintenanceGoal extends Goal{
    Literal literal;

    public static Goal empty() {
        return MaintenanceGoal.from(Literal.builder().atom(Atom.from("null")).build());
    }
}
