package agentscript.language.entities.expression;

import agentscript.language.entities.plan.PrimitiveAction;
import agentscript.language.entities.terms.Term;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class TermExpression extends Expression implements IExpression{
    Term term;

    public final boolean is_term = true;

    @Override
    public String getAsStructure() {
        return term.getAsStructure();
    }

    @Override
    public String getAsNative() {
        return term.getAsValue();
    }


}
