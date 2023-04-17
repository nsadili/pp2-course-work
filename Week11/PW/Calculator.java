package PW;

public class Calculator {
    public static void main(String[] args){
        calculator addition = (a, b) -> System.out.println(a+b);
        calculator subtraction = (a, b) -> System.out.println(a-b);
        calculator multiplication = (a, b) -> System.out.println(a*b);
        calculator division = (a, b) -> System.out.println(a/b);
        calculator exponentiation = (a, b) -> System.out.println(Math.pow(a, b));

        addition.doubleCalculate(4.5, 2.5);
        subtraction.doubleCalculate(3.2, 2.3);
        multiplication.doubleCalculate(5.2, 8.4);
        division.doubleCalculate(34.2, 1.8);
        exponentiation.doubleCalculate(7.8, 4.3);
    }

    public interface calculator{
        public void doubleCalculate(double a, double b);
    }
}
