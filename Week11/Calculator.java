package Week11;

interface Calculator {
    double calculate(double a, double b);
}

class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = Math::pow;

        double a = 5.0;
        double b = 2.0;

        System.out.println("Addition: " + addition.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Division: " + division.calculate(a, b));
        System.out.println("Exponentiation: " + exponentiation.calculate(a, b));
    }
}
