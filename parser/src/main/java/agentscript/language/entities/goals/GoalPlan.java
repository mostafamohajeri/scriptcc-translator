package agentscript.language.entities.goals;

import agentscript.language.entities.*;
import agentscript.language.entities.expression.Expression;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor(staticName = "empty")
public class GoalPlan {

    Literal goal;
    List<Plan> plans;

    public void addPlan(Plan p) {
        plans.add(p);
    }

}
