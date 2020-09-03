package agentscript.language.entities.plan;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.terms.Literal;
import lombok.*;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(staticName = "empty")
public class Plan {

    @Singular
    List<String> annotations;
    PlanTrigger trigger;
    Literal literal;
    Expression expression;
    PlanDefinition planDefinition;

    public boolean getAtomic() {
        return annotations.contains("@atomic");
    }

    public String getHeadCheck() {
        if(literal.getVars().size() == 0) return "/* " + literal.getAsStructure() + " All vars no need to check */" ;

        return this.literal.getAsStructure() +
                ",StructTerm(\""+literal.getAtom().getName() + "\",params.l_params)";
    }

}
