public class Operand implements EvalInterface {
    private double value;
    public String label;

    public Operand(String label, double value) {
        this.label = label;
        this.value = value;
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

public interface EvalInterface {
    double toValue();
    String toString();
}

public abstract class BinaryOperation implements EvalInterface {
    private EvalInterface op1;
    private EvalInterface op2;
    private String label;

    public BinaryOperation(String label, EvalInterface op1, EvalInterface op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.label = label;
    }

    protected abstract double calculate(EvalInterface op1, EvalInterface op2);

    @Override
    public double toValue() {
        return calculate(op1, op2);
    }

    @Override
    public String toString() {
        return "( " + op1.toString() + " " + label + " " + op2.toString() + " )";
    }
}

public class Sum extends BinaryOperation {
    public Sum(EvalInterface op1, EvalInterface op2) {
        super("+", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() + op2.toValue();
    }
}

public class Subtr extends BinaryOperation {
    public Subtr(EvalInterface op1, EvalInterface op2) {
        super("-", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() - op2.toValue();
    }
}

public class Mult extends BinaryOperation {
    public Mult(EvalInterface op1, EvalInterface op2) {
        super("*", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() * op2.toValue();
    }
}

public class Div extends BinaryOperation {
    public Div(EvalInterface op1, EvalInterface op2) {
        super("/", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() / op2.toValue();
    }
}

public abstract class UnaryOperation implements EvalInterface {
    private EvalInterface op;
    private String label;

    public UnaryOperation(String label, EvalInterface op) {
        this.op = op;
        this.label = label;
    }

    protected abstract double calculate(EvalInterface op);

    @Override
    public double toValue() {
        return calculate(op);
    }

    @Override
    public String toString() {
        return label + "(" + op.toString() + ")";
    }
}

public class SquareRoot extends UnaryOperation {
    public SquareRoot(EvalInterface op) {
        super("sqrt", op);
    }

    @Override
    protected double calculate(EvalInterface op) {
        return Math.sqrt(op.toValue());
    }
}

public class Factorial extends UnaryOperation {
    public Factorial(EvalInterface op) {
        super("fact", op);
    }

    @Override
    protected double calculate(EvalInterface op) {
        int n = (int) op.toValue();
        if (n < 0) {
            throw new IllegalArgumentException("Factorial undefined for negative numbers");
        } else if (n == 0
