
import agentscript.language.entities.goals.AchievementGoal;
import agentscript.language.entities.goals.MaintenanceGoal;
import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class InitialGoalsTest {

    private String code = "a(2). b(m). !!~a(10). !!m(10). !c(d(s),m('aaa')).";

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = InitialGoalsTest.parse(code);
    }


    @After
    public void deleteParser() {
        parser = null;
    }

    @Test
    public void testCountGoals() {
        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());
        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().size(),equalTo(3));

    }

    @Test
    public void testTypeOfGoals() {
        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());
        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().size(),equalTo(3));
        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().get(0).getGoal(), instanceOf(MaintenanceGoal.class));
        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().get(2).getGoal(), instanceOf(AchievementGoal.class));
    }


}
