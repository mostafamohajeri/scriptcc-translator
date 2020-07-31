import translation.Translator;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("simple_listener/Agent_listener.asl").getFile()).getAbsolutePath(),
                "listener","out");

        t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("simple_listener/Agent_talker.asl").getFile()).getAbsolutePath(),
                "talker","out");
//
//        t = new Translator();
//        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/client.asl").getFile()).getAbsolutePath(),
//                "client","out");
    }

}
