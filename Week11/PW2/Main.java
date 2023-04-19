public class Main {
    public static void main(String[] args) {
        // Step b: Implement Calculator using lambda expressions

        Calculator addition = (a, b) -> a + b;

        Calculator subtraction = (a, b) -> a - b;

        Calculator multiplication = (a, b) -> a * b;

        Calculator division = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return a / b;
        };

        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        // Test calculations
        double a = 5.0;
        double b = 2.0;

        System.out.println("Addition: " + addition.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Division: " + division.calculate(a, b));
        System.out.println("Exponentiation: " + exponentiation.calculate(a, b));
    }
}
