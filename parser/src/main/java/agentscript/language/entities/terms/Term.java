package agentscript.language.entities.terms;

public class Term {
    public static Term empty() {
        return new Term();
    }
    public String getAsValue() {return "Value";}
    public String getAsStructure() {return "TERM";}
}
