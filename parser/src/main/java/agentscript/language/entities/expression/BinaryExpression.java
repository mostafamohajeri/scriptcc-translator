package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class BinaryExpression extends Expression {
    Expression lhs;
    String operator;
    Expression rhs;

    public String getSt4() {
        var l_lhs = lhs.getSt4();
        var l_op = operator;
        var l_rhs = lhs.getSt4();

        return
                String.format(" Comparer.compare( %s, %s, \"%s\") ", lhs.getSt4(),rhs.getSt4(),operator);

    }



}
