package Week11.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mult = (a, b) ->  a * b;
        Calculator div = (a, b) -> a / b;
        Calculator expon = (a, b) -> Math.pow(a, b);

        System.out.println(add.calculate(5, 3));
        System.out.println(sub.calculate(5, 3));
        System.out.println(mult.calculate(5, 3));
        System.out.println(div.calculate(15, 3));
        System.out.println(expon.calculate(5, 3));
    }
}
