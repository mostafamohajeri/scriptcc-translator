import agentscript.language.entities.AchievementGoal;
import agentscript.language.entities.MaintenanceGoal;
import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class InitialPlansTest {

    private String code = "a(2). b(m). !!~a(10). !!m(10). !c(d(s),m('aaa')). +!m : x(X) && (x(D) || m(1))mv => !m(1).";

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = InitialPlansTest.parse(code);
    }


    @After
    public void deleteParser() {
        parser = null;
    }

    @Test
    public void testCountGoals() {
        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());
        assertThat(agentVisitor.getFactory().getM_plans().size(),equalTo(1));

    }



}
