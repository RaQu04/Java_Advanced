package OOP_exe1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;

    public String description(){
        return "Hi, my brand is " + this.brand + ", and my model is " + this.model;
    }

}
