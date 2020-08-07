package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
@Getter
public class NegationExpression extends Expression implements IExpression {
    Expression expression;
    @Override
    public String getSt4() {
        return String.format("StructTerm(\"not\",Seq[GenericTerm](%s))",expression.getSt4());
    }
    @Override
    public String getNative() {
        return String.format("!( %s )",expression.getSt4());
    }

    public String getScala() {
        return String.format("!( %s )",expression.getSt4());
    }
}
