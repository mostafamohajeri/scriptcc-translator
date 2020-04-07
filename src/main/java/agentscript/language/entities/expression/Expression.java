package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor()
public class Expression {

    Expression expression;
    public static Expression empty() {
        return new Expression();
    }
}
