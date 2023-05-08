interface ICalculator {
    double calculate(double a, double b);
}

public class Calculator {
    ICalculator addition = (a, b) -> a + b;
    
    ICalculator subtraction = (a, b) -> a - b;
    
    ICalculator multiplication = (a, b) -> a * b;
    
    ICalculator division = (a, b) -> a / b;
    
    ICalculator exponentiation = (a, b) -> Math.pow(a, b);
    

         public static void main(String[] args) {
         Calculator calculator = new Calculator();
         System.out.println(calculator.addition.calculate(2, 5));
     }
}