package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class ForLoop implements IPlanStep {
    Expression expression;
    @Singular
    private List<IPlanStep> steps;

    public static ForLoop empty() {
        return ForLoop.builder().build();
    }
}
