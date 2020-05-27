package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class BeliefAction implements IPlanStep {
    ActionOperator actionOperator;
    Literal literal;

    public String getWritableName () {return literal.getAtom().getName();}
    public List<Term> getWritableTerms() {return literal.getTerms();}
    public final boolean belief = true;

    public static BeliefAction empty() {
        return new BeliefAction();
    }

}
