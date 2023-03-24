package Week06.ArithmeticOperations;

public abstract class BinaryOperation implements EvalInterface {
    private EvalInterface op1;
    private EvalInterface op2;
    private String label;

    public BinaryOperation(String label, EvalInterface op1, EvalInterface op2) {
        this.label = label;
        this.op1 = op1;
        this.op2 = op2;
    }

    protected abstract double calcluate(EvalInterface op1, EvalInterface op2);

    @Override
    public double toValue() {
        // TODO Auto-generated method stub
        return calcluate(op1, op2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(" + op1.toString() + " " + label + " " + op2 + ")";
    }
}
