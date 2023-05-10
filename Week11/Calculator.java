package Week11;

public class Calculator {
    public static void main(String[] args) {
        CalculatorInterface add = (a, b) -> a + b;
        CalculatorInterface subtract = (a, b) -> a - b;
        CalculatorInterface multiply = (a, b) -> a * b;
        CalculatorInterface divide = (a, b) -> a / b;
        CalculatorInterface exponentiate = (a, b) -> Math.pow(a, b);
    }
}

@FunctionalInterface
interface CalculatorInterface {
    double calculate(double a, double b);
}