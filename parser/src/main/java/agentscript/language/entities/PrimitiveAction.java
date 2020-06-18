package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class PrimitiveAction extends Term implements IPlanStep {
    Atom atom;
    List<Term> terms;

    public String getWritableName () {return atom.getName(); }
    public List<Term>  getWritableTerms() {return terms; }
    public final boolean primitive = true;

    @Override
    public String getValue() {
        String s = getWritableName() +
                "(" +
                getWritableTerms().stream().map(Term::getValue).collect(Collectors.joining(",")) +
                ")";
        return s;
    }

    public String getCall() {
        String s =
                getWritableName() +
                "(" +
                getWritableTerms().stream().map(t-> t.getValue() ).collect(Collectors.joining(",")) +
                ")";
        return s;
    }

    public String getRefName() {
        String s = "TermUtilWrapper.dynamicObjectToTerm("  +
                getCall() +
                ")";
        return s;
    }

    public static PrimitiveAction empty() {
        return new PrimitiveAction();
    }
}
