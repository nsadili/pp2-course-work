@FunctionalInterface
interface Calculator {
    double calculate(double a, double b);
}

public class PW_3_Calculator {
    public static void main(String[] args) {

        double a = 10.0;
        double b = 2.0;

        //i. addition (a+b)
        Calculator addition = (x, y) -> x + y;
        double result = addition.calculate(a, b);
        System.out.println(a + " + " + b + " = " + result);

        //ii. subtraction (a-b)
        Calculator subtraction = (x, y) -> x - y;
        result = subtraction.calculate(a, b);
        System.out.println(a + " - " + b + " = " + result);

        //iii. multiplication (a*b)
        Calculator multiplication = (x, y) -> x * y;
        result = multiplication.calculate(a, b);
        System.out.println(a + " * " + b + " = " + result);

        //iv. division (a/b)
        Calculator division = (x, y) -> x / y;
        result = division.calculate(a, b);
        System.out.println(a + " / " + b + " = " + result);

        //v. exponentiation (a^b)
        Calculator exponentiation = (x, y) -> Math.pow(x, y);
        result = exponentiation.calculate(a, b);
        System.out.println(a + " ^ " + b + " = " + result);

    }
}
