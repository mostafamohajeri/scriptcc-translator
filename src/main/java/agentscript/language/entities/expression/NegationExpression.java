package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor (staticName = "from")
@Getter
public class NegationExpression extends Expression {
    Expression expression;
}
