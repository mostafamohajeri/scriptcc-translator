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
public class Literal extends Term {

    boolean negated;

    Atom atom;

    @Singular
    List<Expression> expressions;

    public List<Expression> getVars() {
        return expressions
                .stream()
                .filter(t -> !(t instanceof TermExpression) || !(((TermExpression) t).getTerm() instanceof Variable))
                .collect(Collectors.toList());
    }

    public static Literal empty() {
        return Literal.builder().build();
    }

    @Override
    public String getAsValue() {
        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\"");
        builder.append(this.getAtom().getName());
        builder.append("\",Seq[GenericTerm](");
        if(this.getExpressions().size()>0) {
            builder.append(this.getExpressions()
                    .stream()
                    .map(IExpression::getAsNative)
                    .collect(Collectors.joining(",")));
        }

        builder.append("))");
        return builder.toString();
    }

    @Override
    public String getAsStructure() {

        StringBuilder builder = new StringBuilder();
        builder.append("StructTerm(\"");
        builder.append(this.getAtom().getName());
        builder.append("\",Seq[GenericTerm](");
        if(this.getExpressions().size()>0) {
            builder.append(this.getExpressions()
                    .stream()
                    .map(IExpression::getAsStructure)
                    .collect(Collectors.joining(",")));
        }

        builder.append("))");
        return builder.toString();
    }


}
