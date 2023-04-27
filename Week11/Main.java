package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator sum = (a, b) -> a + b;
        Calculator subs = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;
        Calculator divi = (a, b) -> a / b;
        Calculator exp = (a, b) -> Math.pow(a, b);

        System.out.println(sum.calculate(3, 5));
        System.out.println(subs.calculate(3, 5));
        System.out.println(mult.calculate(3, 5));
        System.out.println(divi.calculate(3, 5));
        System.out.println(exp.calculate(3, 5));

    }
}