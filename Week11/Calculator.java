package week11;

public class Calculator {

    interface calculator {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        double a = 5.0;
        double b = 2.0;

        calculator addition = (x, y) -> x + y;
        calculator subtraction = (x, y) -> x - y;
        calculator multiplication = (x, y) -> x * y;
        calculator division = (x, y) -> x / y;
        calculator exponentiation = (x, y) -> Math.pow(x, y);

        System.out.println("Addition: " + addition.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Division: " + division.calculate(a, b));
        System.out.println("Exponentiation: " + exponentiation.calculate(a, b));
    }
}

