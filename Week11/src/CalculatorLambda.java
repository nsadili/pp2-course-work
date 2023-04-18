import java.util.Scanner;
public class CalculatorLambda {
    // Define the functional interface
    interface Calculator {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        // Implement the calculator using lambda expressions
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        
        // Testing the calculator
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("a + b = " + addition.calculate(a, b));
        System.out.println("a - b = " + subtraction.calculate(a, b));
        System.out.println("a * b = " + multiplication.calculate(a, b));
        System.out.println("a / b = " + division.calculate(a, b));
        System.out.println("a ^ b = " + exponentiation.calculate(a, b));
        
    }
}
