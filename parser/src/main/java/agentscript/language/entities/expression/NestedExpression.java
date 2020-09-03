package agentscript.language.entities.expression;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "from")
@Getter
public class NestedExpression extends Expression implements IExpression{
    Expression expression;

    @Override public String getAsStructure() {
        return String.format("StructTerm.of( %s , Seq() )",expression.getAsStructure());
    }

    @Override public String getAsNative() {
        return String.format("( %s )",expression.getAsNative());
    }
}
