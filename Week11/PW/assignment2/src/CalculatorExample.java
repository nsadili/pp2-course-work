interface Calculator {
    double calculate(double a, double b);
}

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        Calculator multiply = (a, b) -> a * b;

        Calculator divide = (a, b) -> a / b;

        Calculator exponentiate = (a, b) -> Math.pow(a, b);

        double result = add.calculate(7.5, 4.9);
        System.out.println("7.5 + 4.9 = " + result);

        result = subtract.calculate(10.6, 5.7);
        System.out.println("10.6 - 5.7 = " + result);

        result = multiply.calculate(7.0, 2.5);
        System.out.println("7.0 * 2.5 = " + result);

        result = divide.calculate(9.0, 4.0);
        System.out.println("9.0 / 4.0 = " + result);

        result = exponentiate.calculate(12.0, 5.0);
        System.out.println("12.0 ^ 5.0 = " + result);
    }
}