import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class InferenceRuleTest {

    private String code = "hello('sam'). bye(A) :- hello(A).";

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = InferenceRuleTest.parse(code);
    }


    @After
    public void deleteParser() {
        parser = null;
    }

    @Test
    public void testHeadCheck() {
        CAgentVisitor agentVisitor = new CAgentVisitor();
        Optional<Object> traverseResult = agentVisitor.visit(parser.agent());
        assert(
                agentVisitor.getFactory().getAgent().getInitialBeliefs().size() == 2
        );

    }


}
