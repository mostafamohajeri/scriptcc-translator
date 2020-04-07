package agentscript.language.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Getter
@Builder
public class PlanDefinition {

    @Singular
    private List<PlanStep> steps;
}
