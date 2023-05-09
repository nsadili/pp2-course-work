package arithmetic.bonus;

public abstract class BinaryOperation implements EvalInterface {
    private EvalInterface op1;
    private EvalInterface op2;
    private String label;

    public BinaryOperation(String label, EvalInterface op1, EvalInterface op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.label = label;
    }

    protected abstract double calc(EvalInterface op1, EvalInterface op2);

    @Override
    public double toValue() {
        return calc(op1, op2);
    }

    @Override
    public String toString() {
        return "(" + op1.toString() + " " + label + " " + op2 + ")";
    }
}
