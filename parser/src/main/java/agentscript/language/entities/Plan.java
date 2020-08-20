package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
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

        if(literal.getVars().size() == 0) return "/* " + literal.getRefName(false) + " All vars no need to check */" ;

        return this.literal.getRefName(false) +
                ",StructTerm(\""+literal.atom.name + "\",params.l_params)";
    }

}
