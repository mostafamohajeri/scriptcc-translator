package agentscript.language.entities.goals;

import agentscript.language.entities.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor(staticName = "empty")
public class GoalPlan {

    Literal goal;
    List<Plan> plans;

    public int getArity() {return this.goal.getExpressions().size();}
    public void addPlan(Plan p) {
        plans.add(p);
    }

}
