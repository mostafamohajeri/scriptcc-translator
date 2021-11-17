package agentscript.language.entities.terms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class TermValue<T> extends Term {
    T data;

    @Override
    public String getAsValue() {
        if (data instanceof String) {
            String s = ((String) data).replace("\"","").replace("'","");
            return "StringTerm(\"" + s + "\")";
        }
        else if (data instanceof Number) {
            if (data.toString().contains("."))
                return "DoubleTerm(" + data.toString() + ")";
            else return "IntTerm(" + data.toString() + ")";
        }
        else if (data instanceof Boolean)
            return "BooleanTerm("+((Boolean) data ? "true":"false" )+ ")";

        else throw new RuntimeException("Type " + data.getClass() + " not implemented");
    }

    @Override
    public String getAsStructure() {
        return getAsValue();
    }

}
