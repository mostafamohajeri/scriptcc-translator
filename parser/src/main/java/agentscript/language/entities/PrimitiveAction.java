package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class PrimitiveAction extends Term implements IPlanStep {
    Atom atom;
    //    List<Term> terms;
    List<Expression> expressions;

    List<PrimitiveAction> follows;

    public String getWritableName() {
        return atom.getName();
    }

    public List<Expression> getWritableTerms() {
        return expressions;
    }

    public final boolean primitive = true;

    @Override
    public String getValue() {
        return getCall();
    }

    public String getScalaCode() {
        return this.getCall();
    }

    public String getCall() {
        String s =
                getWritableName();
        if (Objects.nonNull(getWritableTerms())) {
            s += "(";
            if (getWritableTerms().size() > 0) {

                s+=getWritableTerms().stream().map(Expression::getNative).collect(Collectors.joining(","));

            }
            s+= ")";
        }

        if(follows.size() > 0) {
            s+="."+follows.stream().map(PrimitiveAction::getCall).collect(Collectors.joining("."));
        }

        return s;
    }

    @Override
    public String getRefName(boolean isRoot) {
        String s = //"toTerm("  +
                getCall(); //+
//                        "";
        //")";
        return s;
    }

    public static PrimitiveAction empty() {
        return new PrimitiveAction();
    }
}
