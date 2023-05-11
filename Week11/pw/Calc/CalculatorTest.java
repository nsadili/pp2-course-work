package pw.Calc;

public class CalculatorTest {
    public static void main(String[] args) {
       Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        double result1 = addition.calculate(3, 8); 
        double result2 = subtraction.calculate(9, 6);
        double result3 = multiplication.calculate(7, 2); 
        double result4 = division.calculate(10, 2); 
        double result5 = exponentiation.calculate(3, 4); 
    }
}