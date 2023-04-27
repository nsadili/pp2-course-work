package pw;

public class Main {
    public static void main(String[] args) {
       Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> a / b;
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        double result1 = addition.calculate(4.0, 5.0); 
        double result2 = subtraction.calculate(20.0, 7.0); 
        double result3 = multiplication.calculate(3.0, 5.0);
        double result4 = division.calculate(10.0, 4.0); 
        double result5 = exponentiation.calculate(6.0, 3.0); 
    }
}