public class CalculatorExercise {
    interface Calculator {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        System.out.println("Addition: " + addition.calculate(12, 7));
        System.out.println("Subtraction: " + subtraction.calculate(20, 3));
        System.out.println("Multiplication: " + multiplication.calculate(15, 5));
        System.out.println("Division: " + division.calculate(30, 6));
        System.out.println("Exponentiation: " + exponentiation.calculate(10, 5));
    }
}
