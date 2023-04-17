public class CalculatorDemo {
    @FunctionalInterface
    public interface Calculator {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 3;

        Calculator addition = (x, y) -> x + y;
        Calculator subtraction = (x, y) -> x - y;
        Calculator multiplication = (x, y) -> x * y;
        Calculator division = (x, y) -> x / y;
        Calculator exponentiation = (x, y) -> Math.pow(x, y);

        System.out.println("a + b = " + addition.calculate(a, b));
        System.out.println("a - b = " + subtraction.calculate(a, b));
        System.out.println("a * b = " + multiplication.calculate(a, b));
        System.out.println("a / b = " + division.calculate(a, b));
        System.out.println("a ^ b = " + exponentiation.calculate(a, b));
    }
}
