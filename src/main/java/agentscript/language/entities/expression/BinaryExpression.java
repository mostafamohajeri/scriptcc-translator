package agentscript.language.entities.expression;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.expression.ExpressionOperator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter @AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression {
    Expression lhs;
    String operator;
    Expression rhs;
}
