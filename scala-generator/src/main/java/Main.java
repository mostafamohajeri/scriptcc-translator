import translation.Translator;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Translator t = new Translator();
        t.translate(new File(t.getClass().getClassLoader().getResource("kyc/bank.asl").getFile()).getAbsolutePath(),
                "bank");

        t = new Translator();
        t.translate(new File(t.getClass().getClassLoader().getResource("kyc/employee.asl").getFile()).getAbsolutePath(),
                "employee");

        t = new Translator();
        t.translate(new File(t.getClass().getClassLoader().getResource("kyc/client.asl").getFile()).getAbsolutePath(),
                "client");
    }

}
