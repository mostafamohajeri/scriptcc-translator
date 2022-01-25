package agentscript.language.entities.agent;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.terms.Literal;
import agentscript.language.entities.terms.Term;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class InitialBelief {
    Expression term;
}
