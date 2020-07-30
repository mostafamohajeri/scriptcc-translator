package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.antlr.v4.runtime.misc.Pair;

import java.util.Collections;
import java.util.List;
import java.util.Random;

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
