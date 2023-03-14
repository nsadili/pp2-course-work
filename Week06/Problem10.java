package Week06;

interface EvalInterface {
    double toValue();
    String toString();
}

class Operand implements EvalInterface {

    private double value; 
    private String label; 

    public Operand(String label,double value) {
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

abstract class BinaryOperation implements EvalInterface {
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
        return "(" + op1.toString() + " " + label + " " + op2 + ")";
    }
}

class Sum extends BinaryOperation {
    public Sum(EvalInterface op1, EvalInterface op2) {
        super("+", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() + op2.toValue();
    }
}

class Subtr extends BinaryOperation {
    public Subtr(EvalInterface op1, EvalInterface op2) {
        super("-", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() - op2.toValue();
    }
}

class Mult extends BinaryOperation {
    public Mult(EvalInterface op1, EvalInterface op2) {
        super("*", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() * op2.toValue();
    }
}

class Div extends BinaryOperation {
    public Div(EvalInterface op1, EvalInterface op2) {
        super("/", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() / op2.toValue();
    }
}


abstract class UnaryOperation implements EvalInterface {
    private EvalInterface op1;
    private String label;

    public UnaryOperation(String label, EvalInterface op1) {
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
        return "(" + label + op1.toString() + ")";
    }
}

class Factorial extends UnaryOperation {
    public Factorial(String label, EvalInterface op1) {
        super("factorial of ",op1);
    }
    @Override
    protected double calculate(EvalInterface op1) {
        double n = op1.toValue();
        double res = 1;
        for(double i=2;i<=n;i+=1) {
            res *= i;
        }
        return res;
    }
}

class SquareRoot extends UnaryOperation {
    public SquareRoot(String label, EvalInterface op1) {
        super("square root of ", op1);
    }

    @Override
    protected double calculate(EvalInterface op1) {
        double n = op1.toValue();
        return Math.sqrt(n);
    }
}

class TestArithmeticOperations {
    public static void main(String[] args) {
        Operand x = new Operand("x",5); 
        Operand y = new Operand("y",15); 
        Operand z = new Operand("z", 3); 

        System.out.println(x.toString() + " = " + x.toValue());
        System.out.println(y.toString() + " = " + y.toValue());
        System.out.println(z.toString() + " = " + z.toValue());

        System.out.println();

        Sum s = new Sum(x,y);
        Sum s2 = new Sum(new Sum(x,y),z);

        System.out.println(s.toString());
        System.out.println(s.toValue());

        System.out.println(s2.toString());
        System.out.println(s2.toValue());

        System.out.println();

        Subtr subtr = new Subtr(x,y);
        Mult mult = new Mult(x,z);
        Div div = new Div(y,z);

        System.out.println(subtr.toString() + " = " + subtr.toValue());
        System.out.println(mult.toString() + " = " + mult.toValue());
        System.out.println(div.toString() + " = " + div.toValue());

        System.out.println();

        Factorial factorial = new Factorial("x",x);
        SquareRoot squareRoot = new SquareRoot("z",z);
        System.out.println(factorial.toString() + " = " + factorial.toValue());
        System.out.println(squareRoot.toString() + " = " + squareRoot.toValue());
    }
}

public class Problem10 {
    public static void main(String[] args) {
        TestArithmeticOperations.main(new String[]{});
    }
}
