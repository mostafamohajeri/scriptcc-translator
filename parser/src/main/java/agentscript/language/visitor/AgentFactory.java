package agentscript.language.visitor;

import agentscript.language.entities.InitialBelief;
import agentscript.language.entities.Plan;
import agentscript.language.entities.agent.Agent;
import agentscript.language.entities.goals.AchievementGoal;
import agentscript.language.entities.goals.GoalPlan;
import agentscript.language.entities.goals.InitialGoal;
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
                if (gp.getGoal().getAtom().equals(p.getLiteral().getAtom()) && gp.getGoal().getTerms().size() == p.getLiteral().getTerms().size()) {
                    gp.addPlan(p);
                    add = false;
                    break;
                }
            }
            if (add) {
                agent.addGoalPlan(GoalPlan.from(p.getLiteral(), new CopyOnWriteArrayList<>(List.of(p))));
            }
        }

//        for (InitialGoal g :agent.getInitialGoals()) {
//            ((AchievementGoal) g.getGoal()).setGoalPlan(agent);
//        }

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
