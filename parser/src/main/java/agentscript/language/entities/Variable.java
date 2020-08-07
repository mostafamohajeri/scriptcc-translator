package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class Variable extends Term {

    public final boolean is_var = true;
    String name;

    public String getScalaCode() {
        return "vars(\"" + this.name + "\")";
    }

    @Override
    public String getValue() {  return "vars(\"" + this.name + "\")";  }
    @Override
    public String getRefName(boolean isRoot) { return
//           "toTerm(" +
            "vars(\"" + this.name + "\")";
//                    ")";
    }

}
