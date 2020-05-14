//package generate;
//
//import agentscript.language.entities.goals.AchievementGoal;
//import agentscript.language.entities.goals.MaintenanceGoal;
//import agentscript.language.visitor.CAgentVisitor;
//import grammar.AgentLexer;
//import grammar.AgentParser;
//import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.stringtemplate.v4.ST;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.stream.Stream;
//
//import static org.hamcrest.CoreMatchers.instanceOf;
//import static org.hamcrest.Matchers.equalTo;
//import static org.junit.Assert.assertThat;
//
//public class InitialGoalsTest {
//
//
//
//
//
//    @Before
//    public void createParser() {
//        parser = InitialGoalsTest.parse(code);
//    }
//
//
//    @After
//    public void deleteParser() {
//        parser = null;
//    }
//
//    @Test
//    public void testCountGoals() {
//        CAgentVisitor agentVisitor = new CAgentVisitor();
//        agentVisitor.visit(parser.agent());
//        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().size(),equalTo(2));
//
//    }
//
//    @Test
//    public void testTypeOfGoals() {
//        CAgentVisitor agentVisitor = new CAgentVisitor();
//        agentVisitor.visit(parser.agent());
//        assertThat(agentVisitor.getFactory().getAgent().getInitialGoals().size(),equalTo(2));
//        System.out.println("hello");
//
//
//        ST hello = new ST(readLineByLine("/home/msotafa/IdeaProjects/akka-quickstart-scala/src/main/scala/com/example/Test3.scala.stg"));
//        hello.add("initialGoals", agentVisitor.getFactory().getAgent().getInitialGoals());
//        hello.add("goalPlans", agentVisitor.getFactory().getAgent().getGoalPlans());
//        String output = hello.render();
//        System.out.println(code);
//        System.out.println(output);
//
//    }
//
//    private static String readLineByLine(String filePath)
//    {
//        StringBuilder contentBuilder = new StringBuilder();
//
//        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
//        {
//            stream.forEach(s -> contentBuilder.append(s).append("\n"));
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//
//        return contentBuilder.toString();
//    }
//
//
//}
