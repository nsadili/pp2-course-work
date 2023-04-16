package Week11;

public class Calculator {
    public static void main(String[] args) {
        CalculatorInterface addition = (a, b) -> a + b;
        CalculatorInterface subtraction = (a, b) -> a - b;
        CalculatorInterface multiplication = (a, b) -> a * b;
        CalculatorInterface division = (a, b) -> a / b;
        CalculatorInterface exponentiation = (a, b) -> Math.pow(a, b);
    }
}
@FunctionalInterface
interface CalculatorInterface {
    double calculate(double a, double b);
}