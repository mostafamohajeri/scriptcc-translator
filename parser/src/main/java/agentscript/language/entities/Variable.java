package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "from")
public class Variable extends Term {
    String name;
    @Override
    public String getValue() {  return "vars(\"" + this.name + "\")";  }
    @Override
    public String getRefName() { return "TermUtilWrapper.dynamicObjectToTerm(VarManager.bindVarNative(\"" + this.name + "\", vars))"; }
}
