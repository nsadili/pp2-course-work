@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class TestCalculator {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        double result1 = addition.calculate(5, 3);
        System.out.println("Addition: " + result1);

        double result2 = subtraction.calculate(5, 3);
        System.out.println("Subtraction: " + result2);

        double result3 = multiplication.calculate(5, 3);
        System.out.println("Multiplication: " + result3);

        double result4 = division.calculate(6, 3);
        System.out.println("Division: " + result4);

        double result5 = exponentiation.calculate(2, 3);
        System.out.println("Exponentiation: " + result5);
    }
}
