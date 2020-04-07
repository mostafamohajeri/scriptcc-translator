package agentscript.language.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Goal {

    public static Goal empty() {
        return new Goal();
    }
}
