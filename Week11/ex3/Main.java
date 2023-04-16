package ex3;

public class Main implements Calculator {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a+b;
        Calculator substraction = (a,b) -> a-b;
        Calculator multiply = (a,b) -> a*b;
        Calculator divide = (a,b) -> a/b;
        Calculator exp = (a,b) -> Math.pow(a, b);
        System.out.println(add.calculate(2, 5));
        System.out.println(substraction.calculate(10, 3));
        System.out.println(multiply.calculate(5, 5));
        System.out.println(divide.calculate(25, 5));
        System.out.println(exp.calculate(2, 3));
}

    @Override
    public double calculate(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
    }

