package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class AchievementGoal extends Goal {
    Literal literal;

    public static Goal empty() {
        return AchievementGoal.from(Literal.builder().atom(Atom.from("null")).build());
    }
}
