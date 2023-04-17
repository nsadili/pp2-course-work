package Week11;

public class Calculator {
    interface CalculatorFunction {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        CalculatorFunction addition = (a, b) -> a + b;
        CalculatorFunction subtraction = (a, b) -> a - b;
        CalculatorFunction multiplication = (a, b) -> a * b;
        CalculatorFunction division = (a, b) -> a / b;
        CalculatorFunction exponentiation = (a, b) -> Math.pow(a, b);


        System.out.println("Addition: " + addition.calculate(5, 10));
        System.out.println("Subtraction: " + subtraction.calculate(5, 10));
        System.out.println("Multiplication: " + multiplication.calculate(5, 10));
        System.out.println("Division: " + division.calculate(5, 10));
        System.out.println("Exponentiation: " + exponentiation.calculate(5, 10));
    }
}
