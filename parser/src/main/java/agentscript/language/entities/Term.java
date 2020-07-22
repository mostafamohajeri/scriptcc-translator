package agentscript.language.entities;

import java.util.Objects;

public class Term {
    public static Term empty() {
        return new Term();
    }
    public String getValue() {return "Value";}
    public String getRefName(boolean isRoot) {return "TERM";}
    public String getRefName() {
        return this.getRefName(false);
    }
    public String getScalaCode() { return "SCALA_CODE"; }
}
