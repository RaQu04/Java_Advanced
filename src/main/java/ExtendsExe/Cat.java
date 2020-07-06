package ExtendsExe;

public class Cat extends Animal {

    public Cat(String name, String race, int age) {
        super(name, race, age);
    }

    public void voice() {
        System.out.println("Miauu");
    }
}
