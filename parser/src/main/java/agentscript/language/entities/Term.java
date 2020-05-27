package agentscript.language.entities;

import java.util.Objects;

public class Term {
    public static Term empty() {
        return new Term();
    }
    public String getValue() {return "TERM";}
    public String getRefName() {return "TERM";}
}
