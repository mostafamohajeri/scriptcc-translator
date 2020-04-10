package agentscript.language.visitor;

import agentscript.language.entities.agent.Agent;
import agentscript.language.entities.InitialBelief;
import agentscript.language.entities.Plan;
import agentscript.language.entities.goals.InitialGoal;
import lombok.Getter;

public class AgentFactory {

    Agent.AgentBuilder agentBuilder;
    @Getter
    Agent agent;

    public void startAgent() {
        agentBuilder = Agent.builder();
    }

    public void endAgent() {
        agent = agentBuilder.build();
    }

    public void addInitialBelief(InitialBelief l) {
        agentBuilder.initialBelief(l);
    }

    public void addInitialGoal(InitialGoal g) {
        agentBuilder.initialGoal(g);
    }

    public void addPlan(Plan p) {
        agentBuilder.plan(p);
    }

}
