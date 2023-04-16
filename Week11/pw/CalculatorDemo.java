public class CalculatorDemo{

    public interface Calculator {
    double calc(double a, double b);
}

public static void main(String[] args) {
    Calculator addition = (a, b) -> a + b;
    Calculator subtraction = (a, b) -> a - b;
    Calculator multiplication = (a, b) -> a * b;
    Calculator division = (a, b) -> a / b;
    Calculator exponentiation = (a, b) -> Math.pow(a, b);

    System.out.println(addition.calc(5, 6));
    System.out.println(subtraction.calc(1289, 1589));
    System.out.println(division.calc(288, 3));
    System.out.println(exponentiation.calc(4, 5));
    System.out.println(multiplication.calc(5, 0));
}
}
