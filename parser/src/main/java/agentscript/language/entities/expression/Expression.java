package agentscript.language.entities.expression;

import lombok.NoArgsConstructor;

@NoArgsConstructor()
public class Expression {
    public static Expression empty() {
        return new Expression();
    }
    public String getSt4() {
        return "UNKNOWN EXPRESSION";
    }

}
