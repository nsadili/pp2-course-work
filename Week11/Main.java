package Ex3;

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        double a = 5;
        double b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + addition.calculate(a, b));
        System.out.println("a - b = " + subtraction.calculate(a, b));
        System.out.println("a * b = " + multiplication.calculate(a, b));
        System.out.println("a / b = " + division.calculate(a, b));
        System.out.println("a ^ b = " + exponentiation.calculate(a, b));
    }
}
