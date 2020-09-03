package agentscript.language.entities.terms;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class Variable extends Term {

    public final boolean is_var = true;
    String name;

    @Override
    public String getAsValue() {  return "vars(\"" + this.name + "\")";  }

    @Override
    public String getAsStructure() {  return getAsValue();  }

}
