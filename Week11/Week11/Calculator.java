package Week11;

public class Calculator {
    public static void main(String[] args) {
        CalculatorInterface addition = (x, y) -> x + y;
        CalculatorInterface subtraction = (x, y) -> x - y;
        CalculatorInterface multiplication = (x, y) -> x * y;
        CalculatorInterface division = (x, y) -> x / y;
        CalculatorInterface exponentiation = (x, y) -> Math.pow(x, y);
    }
}

@FunctionalInterface
interface CalculatorInterface {
    double calculate(double x, double y);
}