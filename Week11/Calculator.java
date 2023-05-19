public class Calculator {

    double calculate(double a, double b);

    public static void main(String[] args) {
        // Addition
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(5, 3));  

        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(5, 3));  

        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(5, 3));  

        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.calculate(10, 2));  

        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        System.out.println("Exponentiation: " + exponentiation.calculate(2, 3));  
    }
}


