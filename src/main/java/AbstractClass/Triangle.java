package AbstractClass;

public class Triangle extends Figure {
    double c;

    @Override
    double calculateArea() {
        return a*h*0.5;
    }

    @Override
    double calculateCircuit() {
        return a+b+c;
    }
}
