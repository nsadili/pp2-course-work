package BONUS;

public abstract class UnaryOperation implements EvalInterface {
    private EvalInterface op1;
    private String label;

    public UnaryOperation(EvalInterface op1, String label) {
        this.op1 = op1;
        this.label = label;
    }

    protected abstract double calculate(EvalInterface op1);

    @Override
    public double toValue() {
        return calculate(op1);
    }

    @Override
    public String toString() {
        return "(" + op1.toString() + " " + label + ")";
    }
}
