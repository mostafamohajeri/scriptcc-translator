import translation.Translator;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate_to_file("/home/msotafa/IdeaProjects/actor-playgrounds/grounds/src/main/asl/agere2020/ring/test.asl",
                "testagent" +
                        "" +
                        "","out");
//
        t = new Translator();
//        t.translate_to_file("/home/msotafa/IdeaProjects/ASCTestProject/asctestproject/src/test/asl/greeter.asl",
//                "greeter11","out");
//
//        t = new Translator();
//        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/client.asl").getFile()).getAbsolutePath(),
//                "client","out");
    }

}
