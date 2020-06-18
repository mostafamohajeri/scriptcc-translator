package agentscript.language.entities.goals;

import agentscript.language.entities.Literal;
import agentscript.language.entities.Term;
import agentscript.language.entities.agent.Agent;
import lombok.*;
import org.stringtemplate.v4.ST;

import java.util.List;


@RequiredArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class AchievementGoal extends Goal implements IPlanStep {
    @NonNull Literal literal;

    public String getWritableName () {return literal.getAtom().getName();}
    public List<Term>  getWritableTerms() {return literal.getTerms();}
    public final boolean achieve = true;

    public static AchievementGoal empty() {
        return new AchievementGoal();
    }


}
