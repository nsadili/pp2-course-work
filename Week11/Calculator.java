package Week11;

interface Calculator {
    double calculate(double a, double b);
}

public class MCalculator {
    public static void Calculator(String[] args) {
        // Define lambda expressions for the five arithmetic operations
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        // Test the lambda expressions
        double a = 10;
        double b = 5;
        System.out.println(a + " + " + b + " = " + addition.calculate(a, b));
        System.out.println(a + " - " + b + " = " + subtraction.calculate(a, b));
        System.out.println(a + " * " + b + " = " + multiplication.calculate(a, b));
        System.out.println(a + " / " + b + " = " + division.calculate(a, b));
        System.out.println(a + " ^ " + b + " = " + exponentiation.calculate(a, b));
    }
}
