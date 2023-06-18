package Week06;

public class Ex10 {

public interface EvalInterface {
        double toValue();
        String toString();
}
    class Operand implements EvalInterface {
        private double value;
        private String label;

        public Operand(String label, double value) {
         this.label = label;
         this. value = value;
        }

        public double toValue() {
        return value;
        }

        public String toString(){
        return label;
    }
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
    
    public double toValue() {
    return calculate(op1, op2);
    }
  
    public String toString() {
    return "(" + op1.toString() + " " + label + " " + op2 + ")";
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
        private EvalInterface operand;
        private String label;
    
        public UnaryOperation(String label, EvalInterface operand) {
            this.operand = operand;
            this.label = label;
        }
    
        protected abstract double calculate(EvalInterface operand);
    
        public double toValue() {
            return calculate(operand);
        }
    
        public String toString() {
            return "(" + label + operand.toString() + ")";
        }
    }

    public class Negate extends UnaryOperation {
        public Negate(EvalInterface operand) {
            super("-", operand);
        }
    
        @Override
        protected double calculate(EvalInterface operand) {
            return -1 * operand.toValue();
        }
    }

    public class SquareRoot extends UnaryOperation {
        public SquareRoot(EvalInterface operand) {
            super("sqrt", operand);
        }
    
        @Override
        protected double calculate(EvalInterface operand) {
            return Math.sqrt(operand.toValue());
        }
    }
    
    public class Factorial extends UnaryOperation {
        public Factorial(EvalInterface operand) {
            super("!", operand);
        }
    
        @Override
        protected double calculate(EvalInterface operand) {
            int n = (int) operand.toValue();
            if (n < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers");
            }
            double result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
    
        
    public class TestArithmeticOperations {
        public static void main(String[] args) {
    
            Operand x = new Operand("x", 5);
            Operand y = new Operand("y", 15);
            Operand z = new Operand("z", 3);
            Operand v = new Operand("v", 5);
            Negate neg = new Negate(v);

            Operand m = new Operand("m", 9);
            Operand n = new Operand("n", 4);
            SquareRoot sqrt = new SquareRoot(m);
            System.out.println(sqrt.toString());
            System.out.println(sqrt.toValue());
            
            Factorial fact = new Factorial(n);System.out.println(fact.toString());
            System.out.println(fact.toValue());


            Sum s = new Sum(x, y);
            Sum s2 = new Sum(new Sum(x, y), x);
            Subtr sub = new Subtr(y, x);
            Mult mult = new Mult(x, y);
            Div div = new Div(y, x);
    
            System.out.println(s.toString());
            System.out.println(s.toValue());

            System.out.println(s2.toString());
            System.out.println(s2.toValue());

            System.out.println(sub.toString());
            System.out.println(sub.toValue());

            System.out.println(mult.toString());
            System.out.println(mult.toValue());

            System.out.println(div.toString());
            System.out.println(div.toValue());

            System.out.println(neg.toString());
            System.out.println(neg.toValue());
    
        }
    
    }

}
