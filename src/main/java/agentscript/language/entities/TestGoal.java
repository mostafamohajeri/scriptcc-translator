package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class TestGoal extends Goal{
    Literal literal;

    public static Goal empty() {
        return TestGoal.from(Literal.builder().atom(Atom.from("null")).build());
    }
}
