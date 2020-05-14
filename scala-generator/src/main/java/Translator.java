import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.ST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Translator {

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    private void createParser(String file) {
        parser = Translator.parse(readLineByLine(file));
    }
    private void deleteParser() {
        parser = null;
    }



    public  void translate(String input, String  template,String generatedName) {
        createParser(input);

        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());

        ST st = new ST(readLineByLine(template));
        st.add("initialGoals", agentVisitor.getFactory().getAgent().getInitialGoals());
        st.add("goalPlans", agentVisitor.getFactory().getAgent().getGoalPlans());
        st.add("class_name", generatedName);
        String output = st.render();
        writeFile(String.format("scala-playground/src/main/scala/example/%s.scala",generatedName),output);
        System.out.println(output);
        deleteParser();
    }


    private  String readLineByLine(String file)
    {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( Paths.get(file), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }

        return contentBuilder.toString();
    }


    public void writeFile(String file, String content) {
        File fout = new File(file);

        try (FileOutputStream fos = new FileOutputStream(fout);
             OutputStreamWriter osw = new OutputStreamWriter(fos)){
            osw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
