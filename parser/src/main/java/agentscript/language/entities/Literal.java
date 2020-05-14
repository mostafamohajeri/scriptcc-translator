package agentscript.language.entities;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class Literal extends Term {

    boolean negated;

    Atom atom;

    @Singular
    List<Term> terms;

    public static Literal empty() {
        return Literal.builder().build();
    }
}
