package Week11;
import java.util.Scanner;

public class Calculator {interface CalculatorFunc {
    double calculate(double a, double b);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your choice (+, -, *, /, ^):");
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
                System.out.println("Incorrect opearion");
                return;
        }

        System.out.println("First number");
        double number = scanner.nextDouble();

        System.out.println("Second number:");
        double number1 = scanner.nextDouble();

        double answer = func.calculate(number, number1);

        System.out.println("Answer: " + answer);
    }
}
