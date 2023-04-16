@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;
        Calculator exponentiate = Math::pow;

        System.out.println(add.calculate(7, 4));          // Output: 11.0
        System.out.println(subtract.calculate(4, 1));     // Output: 3.0
        System.out.println(multiply.calculate(8, 6));     // Output: 48.0
        System.out.println(divide.calculate(28, 7));      // Output: 4.0
        System.out.println(exponentiate.calculate(5, 2)); // Output: 25.0
    }
}
