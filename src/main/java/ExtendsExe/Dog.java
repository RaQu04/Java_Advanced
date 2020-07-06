package ExtendsExe;

public class Dog extends Animal {
    private String color;

    public Dog(String name, String race, int age, String color) {
        super(name, race, age);
        this.color = color;
    }

    public void voice() {
        System.out.println("Hauu");
    }
}
