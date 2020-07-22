package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class AssignmentAction implements IPlanStep {

    Variable v;
    Term action;

    public final boolean assign = true;

    public String getCall() {
        String s = "vars += (\"" + v.getName() + "\" -> "+ action.getRefName(false) +")";
        return s;
    }


    public static AssignmentAction empty() {
        return new AssignmentAction();
    }
}
