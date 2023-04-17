package Week11;



public class Calculator {
    public static void main(String[] args) {
        
        
        Calc addition = (a, b) -> a + b;
        Calc subtraction = (a, b) -> a - b;
        Calc multiplication = (a, b) -> a * b;
        Calc division = (a, b) -> a / b;
        Calc exponentiation = (a, b) -> Math.pow(a, b);
        

    }
}

@FunctionalInterface
interface Calc {
    
    double calculate(double a, double b);
}