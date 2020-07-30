package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

@Getter
@Builder
public class ConditionBlock implements IPlanStep {

    public Expression expression;
    public   PlanDefinition planDefinition;

    public static ConditionBlock empty() {
        return ConditionBlock.builder().build();
    }
}
