package PW5;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator pow = (a, b) -> Math.pow(a, b);

        System.out.println(add.calculate(4, 4));
        System.out.println(sub.calculate(3, 1));
        System.out.println(mult.calculate(2, 3));
        System.out.println(div.calculate(4, 4));
        System.out.println(pow.calculate(4, 2));
    }
}
