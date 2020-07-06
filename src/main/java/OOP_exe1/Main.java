package OOP_exe1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car audiA6 = new Car("Audi", "A6");
        Car bmwM5 = new Car("BMW", "M5");
        Car citroenC5 = new Car("Citroen", "C5");

        List<Car> cars = new ArrayList<>();
        cars.add(audiA6);
        cars.add(bmwM5);
        cars.add(citroenC5);

        cars.forEach(car -> System.out.println(car.description()));
    }
}
