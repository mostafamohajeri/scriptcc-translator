package simplelang.ob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Clazz {
    @Getter @Setter String name;

    @Singular
    @Setter
    @Getter
    List<Method> methods = new ArrayList<>();

}
