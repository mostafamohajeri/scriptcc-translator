
import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class InitialPlansTest {

    private String code =
                    " belief(2)." +
                    " proposition_1." +
                    " !!~m_goal_1(10)." +
                    " !!m_goal_2(10)." +
                    " !goal( d(s), m('aaa') )." +
                    " +!~m :" +
                        " x(X) && (x(D) || m(1)) && X==D => " +
                            " !goal(1);" +
                            " !goal(m);" +
                            " #action(X,1);" +
                            " ?test_goal(M);" +
                            " +belief(b,M)" +
                        "." +
                    " +!m => " +
                            " !goal(1);" +
                            " !goal(m);" +
                            " #action(X,1);" +
                            " ?test_goal(M);" +
                            " +belief(b,M)" +
                        ".";

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
//        assertThat(agentVisitor.getFactory().getAgent().getGoalPlans().size(),equalTo(1));
    }



}
