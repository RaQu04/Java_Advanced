package AbstractClass;

public class Rectangle extends Figure {


    @Override
    double calculateArea() {
        return a*b;
    }

    @Override
    double calculateCircuit() {
        return (2*a)+(2*b);
    }
}
