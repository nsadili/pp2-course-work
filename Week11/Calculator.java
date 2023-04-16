import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter operation: ");
        String operation = scanner.next();
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(a, b, operation));
    }

    public double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return add(a, b);
            case "-":
                return subtract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
            case "^":
                return exponentiate(a, b);
            default:
                return 0;
        }
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double exponentiate(double a, double b) {
        return Math.pow(a, b);
    }
}