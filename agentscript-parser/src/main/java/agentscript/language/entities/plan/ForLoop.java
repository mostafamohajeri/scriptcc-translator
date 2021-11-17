package agentscript.language.entities.plan;

import agentscript.language.entities.expression.Expression;
import agentscript.language.entities.terms.Variable;
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

    public final boolean for_loop_simple = true;

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

    public String getQuerySimple() {
        String query = String.format("%s",
                expression.getAsStructure().replace(
                        variable.getAsStructure(),
                        Variable.from(getIterationVarName()).getAsStructure()
                )

        );
        return query;
    }



    public static ForLoop empty() {
        return ForLoop.builder().build();
    }
}
