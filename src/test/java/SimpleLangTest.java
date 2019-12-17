import grammar.SimpleLangLexer;
import grammar.SimpleLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Test;
import simplelang.ob.Clazz;
import simplelang.visitors.ClazzVisitor;

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

    @Test
    public void testCountMethods() {
        CharStream charStream = new ANTLRInputStream(code);
        SimpleLangLexer lexer = new SimpleLangLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        parser = new SimpleLangParser(tokens);
        ClazzVisitor classVisitor = new ClazzVisitor();
        Clazz traverseResult = classVisitor.visit(parser.classDeclaration());
        assertThat(traverseResult.getMethods().size(),equalTo(3));
    }

    @Test
    public void testInstruction21() {
        CharStream charStream = new ANTLRInputStream(code);
        SimpleLangLexer lexer = new SimpleLangLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        parser = new SimpleLangParser(tokens);
        ClazzVisitor classVisitor = new ClazzVisitor();
        Clazz traverseResult = classVisitor.visit(parser.classDeclaration());
        assertThat(traverseResult.getMethods().size(),equalTo(2));
        assertThat(traverseResult.getMethods().get(1).getInstructions().size(),equalTo(2));
        assertThat(traverseResult.getMethods().get(1).getInstructions().get(0).getName(),equalTo("instruction21"));
  }


}
