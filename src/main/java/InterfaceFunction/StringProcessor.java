package InterfaceFunction;

public class StringProcessor {

    private StringOperation operation = s -> s;

    public String StringOperation(String s) {
        return operation.operation(s);
    }

    public void setOperation(StringOperation operation) {
        this.operation = operation;
    }
}
