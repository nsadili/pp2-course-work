public interface Calculator {
    double calculate(double a, double b);
}

class Main {
    public static void main(String[] args) {
        // Lambda expressions to implement Calculator interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        // Test the lambda expressions with some example calculations
        double result1 = addition.calculate(2.0, 3.5); // expected result: 5.5
        double result2 = subtraction.calculate(6.0, 2.5); // expected result: 3.5
        double result3 = multiplication.calculate(4.0, 1.5); // expected result: 6.0
        double result4 = division.calculate(10.0, 2.0); // expected result: 5.0
        double result5 = exponentiation.calculate(2.0, 3.0); // expected result: 8.0

        // Print the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    }
}
