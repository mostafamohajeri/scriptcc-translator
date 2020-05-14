package agentscript.language.entities;

public class NumericTermValue extends TermValue<Number> {
    @Override
    public String toString() {
        return this.data.toString();
    }
}
