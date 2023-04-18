package Week11;

public class CalcExmp {
    public static void main(String[] args) {
        // Addition (a + b)
        Calculator addition = (a, b) -> a + b;
        double result = addition.calculate(5, 10); // result = 15
        System.out.println(result);
        
        // Subtraction (a - b)
        Calculator subtraction = (a, b) -> a - b;
        result = subtraction.calculate(10, 5); // result = 5
        System.out.println(result);
        
        // Multiplication (a * b)
        Calculator multiplication = (a, b) -> a * b;
        result = multiplication.calculate(5, 10); // result = 50
        System.out.println(result);
        
        // Division (a / b)
        Calculator division = (a, b) -> a / b;
        result = division.calculate(10, 5); // result = 2
        System.out.println(result);
        
        // Exponentiation (a ^ b)
        Calculator exponentiation = (a, b) -> Math.pow(a, b);
        result = exponentiation.calculate(2, 3); // result = 8
        System.out.println(result);
    }
    
}
