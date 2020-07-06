package ExtendsExe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat figo = new Cat("Figo", "dachowiec", 3);
        Cat max = new Cat("Max", "argention", 6);
        Dog colo = new Dog("Colo", "labrador", 9, "Black");
        Dog negro = new Dog("Negro", "Owczarek niemiecki", 13, "Szary");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(figo);
        animalList.add(max);
        animalList.add(colo);
        animalList.add(negro);

        animalList.forEach(animal -> animal.voice());


    }
}
