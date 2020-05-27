package agentscript.language.entities;

import lombok.Builder;
import lombok.EqualsAndHashCode;
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
    List<Term> terms;

    public static Literal empty() {
        return Literal.builder().build();
    }

    @Override
    public String getValue() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getAtom().getName());
        if(this.getTerms().size()>0) {
            builder.append("(");
            builder.append(this.getTerms()
                    .stream()
                    .map(t -> t.getValue())
                    .collect(Collectors.joining(",")));
            builder.append(")");
        }
        return builder.toString();
    }



    @Override
    public String getRefName() {
        StringBuilder builder = new StringBuilder();

        builder.append("Struct.of(\"");
        builder.append(this.getAtom().getName());
        builder.append("\"");
        builder.append(",");
        if(this.getTerms().size()>0) {
            builder.append(this.getTerms()
                    .stream()
                    .map(t -> t.getRefName())
                    .collect(Collectors.joining(",")));
        }
        else
            builder.append("Array[Term]()");

        builder.append(")");
        return builder.toString();
    }
}
