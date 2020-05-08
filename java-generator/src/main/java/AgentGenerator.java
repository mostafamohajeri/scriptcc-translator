import agentscript.language.entities.agent.IAgent;
import agentscript.language.entities.goals.InitialGoal;

import java.util.List;

public class AgentGenerator implements IGenerator<IAgent> {
    @Override
    public void generate(IAgent object) {
        generateIntialGoals(object.getInitialGoals());
    }

    private void generateIntialGoals(List<InitialGoal> initialGoals) {

      
        
    }

}
