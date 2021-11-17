import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HeadCheckTest {

    private String code = "" +
            "+!hello(Name) : #asString(Name).contains(\"Ms\") == true || #asString(Name).contains(\"Mrs\") =>\n" +
            "    #achieve(#executionContext.src,greetings(\"Madam\"))\n" +
            ".\n" +
            "\n" +
            "+!hello(\"John\") =>\n" +
            "    #achieve(#executionContext.src,greetings(\"John\"))\n" +
            "." +
            "";

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = HeadCheckTest.parse(code);
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
                agentVisitor.getFactory().getAgent().getPlans().size() == 2
        );

        assert(
                !agentVisitor.getFactory().getAgent().getPlans().get(0).getHasHeadCheck()
        );

        assert(
                agentVisitor.getFactory().getAgent().getPlans().get(1).getHasHeadCheck()
                );
    }


}
