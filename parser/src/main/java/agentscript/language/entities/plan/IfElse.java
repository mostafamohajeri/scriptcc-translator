package agentscript.language.entities.plan;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.Collections;
import java.util.List;

@Getter
@Builder
public class IfElse implements IPlanStep {

    @Singular
    private List<ConditionBlock> conditionBlocks;
    private PlanDefinition elseBlock;

    public final boolean if_else = true;

    public ConditionBlock getIfBlock() {
        return conditionBlocks.get(0);
    }

    public List<ConditionBlock> getElseIfBlocks() {
        if(conditionBlocks.size() < 2)
            return Collections.emptyList();
        return conditionBlocks.subList(1,conditionBlocks.size());
    }

    public static IfElse empty() {
        return IfElse.builder().build();
    }
}
