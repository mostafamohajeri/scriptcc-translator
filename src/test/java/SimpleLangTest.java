import grammar.SimpleLangLexer;
import grammar.SimpleLangParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import simplelang.ob.Clazz;
import simplelang.visitors.ClazzVisitor;

import java.util.BitSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleLangTest {

    private String code = "class SomeClass {\n" +
            "    fun1 {\n" +
            "        instruction11\n" +
            "        instruction12\n" +
            "    }\n" +
            "    fun2 {\n" +
            "        instruction21\n" +
            "        instruction22\n" +
            "    }\n" +
            "}";

    private SimpleLangParser parser;


    private static SimpleLangParser parse(String code) {
        SimpleLangLexer lexer = new SimpleLangLexer(new ANTLRInputStream(code));
        SimpleLangParser parser = new SimpleLangParser(new CommonTokenStream(lexer));
        return parser;
    }

    @Before
    public void createParser() {
        parser = SimpleLangTest.parse(code);
    }


    @After
    public void deleteParser() {
        parser = null;
    }

    @Test
    public void testCountMethods() {
        ClazzVisitor classVisitor = new ClazzVisitor();
        Clazz traverseResult = classVisitor.visit(parser.classDeclaration());
        assertThat(traverseResult.getMethods().size(),equalTo(2));
    }

    @Test
    public void testInstruction21() {
        ClazzVisitor classVisitor = new ClazzVisitor();
        Clazz traverseResult = classVisitor.visit(parser.classDeclaration());
        assertThat(traverseResult.getMethods().size(),equalTo(2));
        assertThat(traverseResult.getMethods().get(1).getInstructions().size(),equalTo(2));
        assertThat(traverseResult.getMethods().get(1).getInstructions().get(0).getName(),equalTo("instruction21"));
  }

}
