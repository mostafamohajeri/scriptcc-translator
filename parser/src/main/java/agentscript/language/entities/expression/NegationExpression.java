package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
@Getter
public class NegationExpression extends Expression {
    Expression expression;

    public String getSt4() {
        return String.format("!(%s)",expression.getSt4());
    }
}
