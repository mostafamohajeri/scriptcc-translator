package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.Random;

@Getter
@Builder
public class IfElse implements IPlanStep {


    private Pair<Expression,PlanDefinition> ifBlock;
    @Singular
    private List<Pair<Expression,PlanDefinition>> elseIfBlocks;
    private Pair<Expression,PlanDefinition> elseBlock;

    public final boolean if_else = true;

    public static IfElse empty() {
        return IfElse.builder().build();
    }
}
