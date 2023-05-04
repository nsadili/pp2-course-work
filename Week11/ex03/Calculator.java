package Week11.ex03;

@FunctionalInterface
interface CalculatorInterface<T> {
    double calculate (double a, double b);
}

public class Calculator {
    public static void main(String[] args) {
        CalculatorInterface<Double> add = (a, b) -> a + b;
        CalculatorInterface<Double> subtract = (a, b) -> {
            if (a > b) {
                return a - b;
            } else {
                return b - a;
            }
        };
        CalculatorInterface<Double> multiplication = (a, b) -> a * b;
        CalculatorInterface<Double> division = (a, b) -> a / b;
        CalculatorInterface<Double> exponantiation = (a, b) -> Math.pow(a, b);

        System.out.println(add.calculate(5, 6));
        double a = 12.5;
        double b = 2.5;

        System.out.println(subtract.calculate(a, b));
        System.out.println(multiplication.calculate(a, b));
        System.out.println(division.calculate(a, b));
        System.out.println(String.format("%.2f", exponantiation.calculate(a, b)));
    }
}
