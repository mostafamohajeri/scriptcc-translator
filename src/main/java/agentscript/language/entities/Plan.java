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


}
