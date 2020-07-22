package agentscript.language.entities.expression;

import jdk.jshell.spi.ExecutionControl;
import lombok.NoArgsConstructor;

@NoArgsConstructor()

public abstract class Expression implements IExpression {
    public static Expression empty() {
        return NestedExpression.from(null);
    }
}
