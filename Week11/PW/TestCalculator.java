package PW;

public class TestCalculator {
    public static void main(String[] args) {
        // addition
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(5, 3)); // Output: 8.0

        // subtraction
        Calculator sub = (a, b) -> a - b;
        System.out.println(sub.calculate(5, 3)); // Output: 2.0

        // multiplication
        Calculator mul = (a, b) -> a * b;
        System.out.println(mul.calculate(5, 3)); // Output: 15.0

        // division
        Calculator div = (a, b) -> a / b;
        System.out.println(div.calculate(5, 3)); // Output: 1.6666666666666667

        // exponentiation
        Calculator exp = (a, b) -> Math.pow(a, b);
        System.out.println(exp.calculate(5, 3)); // Output: 125.0
    }
}