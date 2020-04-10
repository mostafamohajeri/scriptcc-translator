package simplelang.ob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Method {
    @Getter @Setter String name;

    @Singular
    @Getter
    List<Instruction> instructions = new ArrayList<>();
}
