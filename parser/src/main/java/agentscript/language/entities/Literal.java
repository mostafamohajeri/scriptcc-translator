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

    public List<Term> getVars() {
        return terms.stream().filter(t -> t instanceof Variable).collect(Collectors.toList());
    }

    public static Literal empty() {
        return Literal.builder().build();
    }


    @Override
    public String getValue() {
//        StringBuilder builder = new StringBuilder();
//        builder.append(this.getAtom().getName());
//        if(this.getTerms().size()>0) {
//            builder.append("(");
//            builder.append(this.getTerms()
//                    .stream()
//                    .map(t -> t.getValue())
//                    .collect(Collectors.joining(",")));
//            builder.append(")");
//        }
//        return builder.toString();
        return getRefName(false);
    }

    public String getScalaCode() {
        return this.getValue();
    }

    @Override
    public String getRefName(boolean isRoot) {

        StringBuilder builder = new StringBuilder();

        builder.append("Struct.of(\"");
        builder.append(this.getAtom().getName());
        builder.append("\"");
        builder.append(",");
        if(this.getTerms().size()>0) {
            builder.append(this.getTerms()
                    .stream()
                    .map(t -> t.getRefName(isRoot))
                    .collect(Collectors.joining(",")));
        }
        else {
            builder.append("java.util.List.of[Term]()");
        }
        builder.append(")");
        return builder.toString();
    }


    private String agentSpecRefName() {
        return
                "Struct.of(executionContext.name," + this.getRefName(false) + ")";
    }

}
