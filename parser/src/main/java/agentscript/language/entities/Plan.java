package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(staticName = "empty")
public class Plan {

    PlanTrigger trigger;
    Literal literal;
    Expression expression;
    PlanDefinition planDefinition;

    public String getHeadCheck() {

        if(literal.getTerms().stream().filter(
                t -> !(t instanceof Variable)
        ).count() == 0) return "/* " + literal.getRefName(false) + " All vars no need to check */" ;

        return this.literal.getRefName(false) +
                ",Struct.of(\""+literal.atom.name + "\",params.l_params.asJava)";
    }

}
