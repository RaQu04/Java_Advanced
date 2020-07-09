package AbstractClass;

public class Circle extends Figure {
    @Override
    double calculateArea() {
        if(r!=0){
            return Math.PI*r*r;
        }
        return 0;
    }

    @Override
    double calculateCircuit() {
        if(r!=0){
            return 2*Math.PI*r;
        }return 0;
    }
}
