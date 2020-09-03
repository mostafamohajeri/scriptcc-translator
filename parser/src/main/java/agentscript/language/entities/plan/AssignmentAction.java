package agentscript.language.entities.plan;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.terms.Variable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class AssignmentAction implements IPlanStep {

    Variable v;
    Expression expression;

    public final boolean assign = true;

    public String getCall() {
        String s = "vars += (\"" + v.getName() + "\" -> "+ expression.getAsNative() +")";
        return s;
    }


    public static AssignmentAction empty() {
        return new AssignmentAction();
    }
}
