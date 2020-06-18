import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate(new File(t.getClass().getClassLoader().getResource("Agent1.asl").getFile()).getAbsolutePath(),
                new File(t.getClass().getClassLoader().getResource("templates/code.stg").getFile()).getAbsolutePath(),
                "gen_agent_a");
    }

}
