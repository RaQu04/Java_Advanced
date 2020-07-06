package ExtendsExe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {
    String name;
    String race;
    int age;

    public abstract void voice();
}
