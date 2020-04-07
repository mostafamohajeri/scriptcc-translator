import agentscript.language.entities.Agent;
import agentscript.language.visitor.CAgentVisitor;
import grammar.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import simplelang.ob.Clazz;
import simplelang.visitors.ClazzVisitor;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class InitialBeliefTest {

    private String code = "a(d). b(10). c(a(d),d('sss')). a(X).";

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = InitialBeliefTest.parse(code);
    }


    @After
    public void deleteParser() {
        parser = null;
    }

    @Test
    public void testCountBeliefs() {
        CAgentVisitor agentVisitor = new CAgentVisitor();
        Optional<Object> traverseResult = agentVisitor.visit(parser.agent());
        assertThat(agentVisitor.getFactory().getM_initialbeliefs().size(),equalTo(4));
    }


}
