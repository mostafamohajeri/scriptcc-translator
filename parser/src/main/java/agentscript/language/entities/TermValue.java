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
            return ((String) data).replace("\"","\\\"");
        else return data.toString();
    }

    public String getRefName() {

        if (data instanceof String) {
            String s = (String) data;
            return "Term.createTerm(\"'" + s.substring(1, s.length()-1) + "'\")";
        }
        else if (data instanceof Number)
            return "Number.of(" + data.toString() + ")";
        else return data.getClass().toString();
    }

}
