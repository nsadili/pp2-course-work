package Week06.ArithmeticOperations;

public class Operand implements EvalInterface {

    private double value;
    private String label;

    public Operand(String label, double value) {
        this.label = label;
        this.value = value;
    }

    @Override
    public double toValue() {
        // TODO Auto-generated method stub
        return value;
    }

    @Override
    public String toString() {
        return label;
    }

}
