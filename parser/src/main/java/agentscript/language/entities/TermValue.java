package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class TermValue<T> extends Term {
    T data;

    public String getValue() {
        if (data instanceof String)
            return ((String) data).replace("\"","").replace("'","");
        else return data.toString();

    }

    public String getRefName() {
        if (data instanceof String) {
            String s = ((String) data).replace("\"","").replace("'","");
            return "Term.createTerm(\"'" + s + "'\")";
        }
        else if (data instanceof Number)
            return "Number.of(" + data.toString() + ")";

        else if (data instanceof Boolean)
            return "Struct.truth("+((Boolean) data ? "true":"false" )+ ")";

        else throw new RuntimeException("Type " + data.getClass() + " not implemented");
    }

}
