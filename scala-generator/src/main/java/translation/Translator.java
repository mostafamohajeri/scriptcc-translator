package translation;

import agentscript.language.visitor.CAgentVisitor;
import grammar.AgentLexer;
import grammar.AgentParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupString;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Translator {

    private AgentParser parser;


    private static AgentParser parse(String code) {
        AgentLexer lexer = new AgentLexer(new ANTLRInputStream(code));
        AgentParser parser = new AgentParser(new CommonTokenStream(lexer));
        return parser;
    }

    private void createParser(File file) {
        parser = Translator.parse(readLineByLine(file));
    }
    private void deleteParser() {
        parser = null;
    }

    public void translate_to_file(String input_file_address ,String generatedName,String output_address) {
        InputStream in = getClass().getResourceAsStream("templates/code.stg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        this.translate_to_file(input_file_address,
                reader.lines().collect(Collectors.joining("\n")),
                generatedName,
                output_address
                );
    }

    public String translate(String input_file_address ,String generatedName) {
        InputStream in = getClass().getResourceAsStream("/templates/code.stg");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return this.translate(input_file_address,
                reader.lines().collect(Collectors.joining("\n")),
                generatedName
        );
    }

    private String translate(String input_file_address ,String template,String generatedName) {
        createParser(new File(input_file_address));

        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());

        STGroupString stGroupString = new STGroupString(template);
        ST st = stGroupString.getInstanceOf("agentdef");
        st.add("initialGoals", agentVisitor.getFactory().getAgent().getInitialGoals());
        st.add("initialBeliefs", agentVisitor.getFactory().getAgent().getInitialBeliefs());
        st.add("goalPlans", agentVisitor.getFactory().getAgent().getGoalPlans());
        st.add("class_name", generatedName);
        return st.render();
    }

    private void translate_to_file(String input_file_address, String template,String generatedName,String output_address) {
        createParser(new File(input_file_address));

        CAgentVisitor agentVisitor = new CAgentVisitor();
        agentVisitor.visit(parser.agent());

        STGroupString stGroupString = new STGroupString(template);
        ST st = stGroupString.getInstanceOf("agentdef");
        st.add("initialGoals", agentVisitor.getFactory().getAgent().getInitialGoals());
        st.add("initialBeliefs", agentVisitor.getFactory().getAgent().getInitialBeliefs());
        st.add("goalPlans", agentVisitor.getFactory().getAgent().getGoalPlans());
        st.add("class_name", generatedName);
        String output = st.render();
        writeFile(String.format("%s/%s.scala",output_address,generatedName),output);
        deleteParser();
    }


    private  String readLineByLine(File file)
    {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines( file.toPath(), StandardCharsets.UTF_8))
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
