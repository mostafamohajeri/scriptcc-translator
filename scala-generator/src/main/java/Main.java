import translation.Translator;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/bank.asl").getFile()).getAbsolutePath(),
                "bank","out");

        t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/employee.asl").getFile()).getAbsolutePath(),
                "employee","out");

        t = new Translator();
        t.translate_to_file(new File(t.getClass().getClassLoader().getResource("kyc/client.asl").getFile()).getAbsolutePath(),
                "client","out");
    }

}
