package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(staticName = "from")
@NoArgsConstructor
public class TermValue<T> extends Term {
    T data;

//    public String getValue() {
//        if (data instanceof String)
//            return "\""+((String) data).replace("\"","").replace("'","") + "\"";
//        else return data.toString();
//
//    }


    @Override
    public String getValue() {
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

    public String getScalaCode() {
        return this.getValue();
    }

    @Override
    public String getRefName(boolean isRoot) {
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

}
