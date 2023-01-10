import translation.Translator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
//
//        Map<Integer> A = new ArrayList<>();
//        for(Integer a : A) {
//            System.out.println(a);
//
//        }
//        Function<Integer,Integer> s = x -> x*x;
//        double p = 2;
//        int s2 = (int) p;
//        int s2 = (int) p;
        Translator t = new Translator();
        t.translate_to_file("/home/msotafa/IdeaProjects/actor-playgrounds/grounds/src/main/asl/agere2020/ring/simple.asl",
                "testagent" +
                        "" +
                        "","out");

        t = new Translator();
        t.translate_to_file("/home/msotafa/IdeaProjects/ASCTestProject/asctestproject/src/test/asl/greeter.asl",
                "greeter11","out");

        t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/client.asl").getFile()).getAbsolutePath(),
                "client","out");
    }

}
