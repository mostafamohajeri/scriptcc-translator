package agentscript.language.entities.goals;

import agentscript.language.entities.Atom;
import agentscript.language.entities.Literal;
import agentscript.language.entities.Term;
import agentscript.language.entities.agent.Agent;
import agentscript.language.entities.expression.Expression;
import lombok.*;
import org.stringtemplate.v4.ST;

import java.util.List;


@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class AchievementGoal extends Goal implements IPlanStep {
    @NonNull Atom atom;
    List<Expression> expressions;

    public String getWritableName() {
        return atom.getName();
    }

    public List<Expression> getWritableTerms() {
        return expressions;
    }

    public final boolean achieve = true;

    public static AchievementGoal empty() {
        return new AchievementGoal();
    }


}
