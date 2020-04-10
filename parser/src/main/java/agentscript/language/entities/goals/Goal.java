package agentscript.language.entities.goals;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Goal {

    public static Goal empty() {
        return new Goal();
    }
}
