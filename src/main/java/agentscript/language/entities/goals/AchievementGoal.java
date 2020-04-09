package agentscript.language.entities.goals;

import agentscript.language.entities.Atom;
import agentscript.language.entities.Literal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class AchievementGoal extends Goal implements IPlanStep {
    Literal literal;

    public static AchievementGoal empty() {
        return new AchievementGoal();
    }

}
