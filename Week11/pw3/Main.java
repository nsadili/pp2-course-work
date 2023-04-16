package pw3;

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
         Calculator subtraction = (a, b) -> a - b;
         Calculator multiplication = (a, b) -> a * b;
         Calculator division = (a, b) -> a / b;
         Calculator exponentiation = (a, b) -> Math.pow(a, b);
 
         double result1 = addition.calculate(3.0, 5.0); // result1 = 8.0
         double result2 = subtraction.calculate(10.0, 6.0); // result2 = 4.0
         double result3 = multiplication.calculate(4.0, 7.0); // result3 = 28.0
         double result4 = division.calculate(10.0, 2.0); // result4 = 5.0
         double result5 = exponentiation.calculate(2.0, 3.0); // result5 = 8.0
     }
 }

