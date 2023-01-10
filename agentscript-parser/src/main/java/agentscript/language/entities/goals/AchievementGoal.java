package agentscript.language.entities.goals;

import agentscript.language.entities.plan.IPlanStep;
import agentscript.language.entities.terms.Atom;
import agentscript.language.entities.expression.Expression;
import lombok.*;

import java.util.List;


@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
@Getter
public class AchievementGoal extends Goal implements IPlanStep {
    @NonNull boolean negated;
    @NonNull Atom atom;
    List<Expression> expressions;

    public String getWritableName() {
        return atom.getName();
    }

    public String getNameWithArity() {
        int arity = (this.getExpressions()==null ? 0 : this.getExpressions().size());
        return "adopt_achievement_"+this.getAtom().getName() + "_" + arity ; }



    public List<Expression> getWritableTerms() {
        return expressions;
    }

    public final boolean achieve = true;

    public static AchievementGoal empty() {
        return new AchievementGoal();
    }


}
