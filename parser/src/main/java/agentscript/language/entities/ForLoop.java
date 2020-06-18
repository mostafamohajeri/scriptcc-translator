package agentscript.language.entities;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.goals.IPlanStep;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.util.Random;

@Getter
@Builder
public class ForLoop implements IPlanStep {

    Variable variable;
    Variable itName;
    Expression expression;
    @Singular
    private List<IPlanStep> steps;

    public final boolean for_loop = true;

    public String getVarName() {
        return variable.getName();
    }

    public String getIterationVarName() {
        if(itName == null) {
            int r = new Random().nextInt(100000);
            itName = Variable.from("L" + r);
        }
        return itName.getName();
    }

    public String getQuery() {
        String query = String.format("Struct.of(\"findall\",%s,%s,%s)",
                variable.getRefName(),
                expression.getSt4(),
                itName.getRefName()
        );
        return query;
    }

    public static ForLoop empty() {
        return ForLoop.builder().build();
    }
}
