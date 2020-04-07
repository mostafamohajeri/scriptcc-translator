package agentscript.language.visitor;

import agentscript.language.entities.*;
import grammar.AgentParser;
import lombok.Getter;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class AgentFactory {

    Agent.AgentBuilder agentBuilder;
    Agent agent;
    @Getter
    private final List<Literal> m_initialbeliefs = new CopyOnWriteArrayList<>();

    @Getter
    private final List<Goal> m_initialGoals = new CopyOnWriteArrayList<>();

    @Getter
    private final List<Plan> m_plans = new CopyOnWriteArrayList<>();

    public void startAgent() {
        agentBuilder = Agent.builder();
    }

    public void endAgent() {
        agent = agentBuilder.build();
    }

    public void addInitialBelief(Literal l) {
        m_initialbeliefs.add(l);
    }

    public void addInitialGoal(Goal g) {
        m_initialGoals.add(g);
    }

    public void addPlan(Plan p) {
        m_plans.add(p);
    }

}
