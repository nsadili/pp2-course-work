package Week11;

interface Calculator {
    double calculate(double a, double b);
}

public class PWCalculator {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        System.out.println("5 + 3 = " + addition.calculate(5, 3));
        
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("5 - 3 = " + subtraction.calculate(5, 3));
        
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("5 * 3 = " + multiplication.calculate(5, 3));
        
        Calculator division = (a, b) -> a / b;
        System.out.println("5 / 3 = " + division.calculate(5, 3));
        
        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        System.out.println("5 ^ 3 = " + exponentiation.calculate(5, 3));
    }
}
