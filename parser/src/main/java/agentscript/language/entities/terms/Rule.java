package agentscript.language.entities.terms;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.expression.IExpression;
import agentscript.language.entities.expression.TermExpression;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
public class Rule extends Term {

    Literal LHS;
    Expression RHS;

    public static Rule empty() {
        return Rule.builder().build();
    }

    @Override
    public String getAsValue() {
        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\":-\",");
        builder.append(this.getLHS().getAsValue());
        builder.append(",");
        builder.append(this.getRHS().getAsNative());

        builder.append(")");
        return builder.toString();
    }

    @Override
    public String getAsStructure() {
        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\":-\",");
        builder.append(this.getLHS().getAsStructure());
        builder.append(",");
        builder.append(this.getRHS().getAsStructure());

        builder.append(")");
        return builder.toString();
    }


}
