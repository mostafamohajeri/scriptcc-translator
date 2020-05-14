package agentscript.language.entities;

import agentscript.language.entities.goals.IPlanStep;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class PrimitiveAction implements IPlanStep {
    Atom atom;
    List<Term> terms;

    public String getWritableName () {return atom.getName(); }
    public List<Term>  getWritableTerms() {return terms; }
    public final boolean primitive = true;


    public static PrimitiveAction empty() {
        return new PrimitiveAction();
    }
}
