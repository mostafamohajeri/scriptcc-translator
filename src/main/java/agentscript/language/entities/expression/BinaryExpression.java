package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression {
    Expression lhs;
    String operator;
    Expression rhs;
}
