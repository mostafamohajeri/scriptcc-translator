package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
@Getter
public class NestedExpression extends Expression implements IExpression{
    Expression expression;
    @Override public String getSt4() {
        return String.format("StructTerm.of( %s , Seq() )",expression.getSt4());
    }
    public String getNative() {
        return String.format("( %s )",expression.getNative());
    }

    public String getScala() {
        return String.format("( %s )",expression.getNative());
    }
}
