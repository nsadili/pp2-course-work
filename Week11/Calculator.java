package Week11;
import java.util.Scanner;

public class Calculator {
    interface CalculatorFunc {
        double calculate(double a, double b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the operation to be performed (+, -, *, /, ^):");
        String operation = scanner.nextLine();

        CalculatorFunc func = null;

        switch (operation) {
            case "+":
                func = (a, b) -> a + b;
                break;
            case "-":
                func = (a, b) -> a - b;
                break;
            case "*":
                func = (a, b) -> a * b;
                break;
            case "/":
                func = (a, b) -> a / b;
                break;
            case "^":
                func = (a, b) -> Math.pow(a, b);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = func.calculate(num1, num2);

        System.out.println("Result: " + result);
    }
}
