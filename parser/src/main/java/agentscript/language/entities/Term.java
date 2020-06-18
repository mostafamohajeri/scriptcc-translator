package agentscript.language.entities;

import java.util.Objects;

public class Term {
    public static Term empty() {
        return new Term();
    }
    public String getValue() {return "Value";}
    public String getRefName() {return "TERM";}
}
