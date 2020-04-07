package agentscript.language.entities.expression;

import agentscript.language.entities.Term;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor(staticName = "from")
public class TermExpression extends Expression{
    Term term;
}
