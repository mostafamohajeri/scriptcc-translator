package agentscript.language.entities.expression;

import agentscript.language.entities.PrimitiveAction;
import agentscript.language.entities.Term;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class TermExpression extends Expression implements IExpression{
    Term term;

    public final boolean is_term = true;

    @Override
    public String getSt4() {
        if(term instanceof PrimitiveAction)
            return term.getRefName(true);
        return term.getRefName(true);
    }

    @Override
    public String getNative() {
        if(term instanceof PrimitiveAction)
            return ((PrimitiveAction) term).getCall();
        return term.getValue();
    }

    @Override
    public String getScala() {
        if(term instanceof PrimitiveAction)
            return ((PrimitiveAction) term).getCall();
        return term.getValue();
    }

}
