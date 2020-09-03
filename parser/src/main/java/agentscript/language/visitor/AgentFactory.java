package agentscript.language.visitor;

import agentscript.language.entities.agent.InitialBelief;
import agentscript.language.entities.plan.Plan;
import agentscript.language.entities.agent.Agent;
import agentscript.language.entities.goals.GoalPlan;
import agentscript.language.entities.agent.InitialGoal;
import lombok.Getter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AgentFactory {

    Agent.AgentBuilder agentBuilder;
    @Getter
    Agent agent;


    public void startAgent() {
        agentBuilder = Agent.builder();
    }

    public void endAgent() {
        agent = agentBuilder.build();

        agent.setGoalPlans(new CopyOnWriteArrayList<>());
        for (Plan p : agent.getPlans()) {
            boolean add = true;

            for (GoalPlan gp : agent.getGoalPlans()) {
                if (gp.getGoal().getAtom().equals(p.getLiteral().getAtom()) && gp.getGoal().getExpressions().size() == p.getLiteral().getExpressions().size()) {
                    gp.addPlan(p);
                    add = false;
                    break;
                }
            }
            if (add) {
                agent.addGoalPlan(GoalPlan.from(p.getLiteral(), new CopyOnWriteArrayList<>(List.of(p))));
            }
        }

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
