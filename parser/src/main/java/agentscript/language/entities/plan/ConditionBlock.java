package agentscript.language.entities.plan;

import agentscript.language.entities.expression.Expression;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ConditionBlock implements IPlanStep {

    public Expression expression;
    public PlanDefinition planDefinition;

    public static ConditionBlock empty() {
        return ConditionBlock.builder().build();
    }
}
