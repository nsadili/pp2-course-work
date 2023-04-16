package ex3;

public interface Calculator {
    double calculate(double a, double b);

    Calculator add = (a,b) -> a+b;
    Calculator substraction = (a,b) -> a-b;
    Calculator multiply = (a,b) -> a*b;
    Calculator divide = (a,b) -> a/b;
    Calculator exp = (a,b) -> Math.pow(a, b);

    public static void main(String[] args) {
        System.out.println(add.calculate(2, 5));
        System.out.println(substraction.calculate(10, 3));
        System.out.println(multiply.calculate(5, 5));
        System.out.println(divide.calculate(25, 5));
        System.out.println(exp.calculate(2, 3));
    }
}
