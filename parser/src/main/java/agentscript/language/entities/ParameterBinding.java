package agentscript.language.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "from")
public class ParameterBinding {
    String name;
    Object value;
}
