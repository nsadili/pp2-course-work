package week11;
@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);


public class Cascsaas {
    public static void main(String[] args) {
        
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(0, 3)); 
        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(2, 3)); 
        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(6, 3)); 
        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.calculate(5342, 3)); 
        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        System.out.println("Exponentiation: " + exponentiation.calculate(34432, 3)); 
    }
}
}


