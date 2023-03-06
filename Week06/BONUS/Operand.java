package BONUS;

public class Operand implements EvalInterface {
    private double value;
    private String label;

    public Operand(double value, String label) {
        this.value = value;
        this.label = label;
    }

    @Override
    public double toValue() {
        return value;
    }

    @Override
    public String toString() {
        return label;
    }

}
