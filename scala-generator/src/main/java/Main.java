import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate(new File(t.getClass().getClassLoader().getResource("In.asl").getFile()).getAbsolutePath(),
                new File(t.getClass().getClassLoader().getResource("Test3.scala.stg").getFile()).getAbsolutePath(),
                "GeneratedAgent1");
    }

}
