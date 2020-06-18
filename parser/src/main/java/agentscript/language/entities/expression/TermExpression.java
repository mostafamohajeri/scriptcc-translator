package agentscript.language.entities.expression;

import agentscript.language.entities.PrimitiveAction;
import agentscript.language.entities.Term;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class TermExpression extends Expression {
    Term term;

    public String getSt4() {
        if(term instanceof PrimitiveAction)
            return term.getRefName();
        return term.getRefName();
    }

}
