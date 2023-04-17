package Week11.pw3;

interface Calculator {
    double calculate(double a, double b);
}

public class CalculatorDemo {
    public static void main(String[] args) {
        double a = 10, b = 5;
        
        Calculator addition = (x, y) -> x + y;
        double result = addition.calculate(a, b);
        System.out.println(a + " + " + b + " = " + result);

        Calculator subtraction = (x, y) -> x - y;
        result = subtraction.calculate(a, b);
        System.out.println(a + " - " + b + " = " + result);

        Calculator multiplication = (x, y) -> x * y;
        result = multiplication.calculate(a, b);
        System.out.println(a + " * " + b + " = " + result);

        Calculator division = (x, y) -> x / y;
        result = division.calculate(a, b);
        System.out.println(a + " / " + b + " = " + result);

        Calculator exponentiation = (x, y) -> Math.pow(x, y);
        result = exponentiation.calculate(a, b);
        System.out.println(a + " ^ " + b + " = " + result);
    }
}
