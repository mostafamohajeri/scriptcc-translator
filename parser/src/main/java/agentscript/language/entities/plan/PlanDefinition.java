package agentscript.language.entities.plan;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class PlanDefinition {

    @Singular
    private List<IPlanStep> steps;

    public static PlanDefinition empty() {
        return PlanDefinition.builder().build();
    }
}
