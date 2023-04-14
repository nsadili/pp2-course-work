package Week11.Calculator;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Calculator add = (num1, num2) -> num1 +num2;

        Calculator sub = (num1, num2) -> num1 -num2;

        Calculator div = (num1, num2) -> num1/num2;

        Calculator mult = (num1, num2) -> num1 *num2;

        Calculator exp = (num1, num2) -> Math.pow(num1, num2);

        Function<Integer, Integer> doubleValue = x -> x * 2;
    int result = doubleValue.apply(5);


        System.out.println(add.calculate(4,5));
        System.out.println(sub.calculate(4,5));
        System.out.println(div.calculate(4,5));
        System.out.println(mult.calculate(4,5));
        System.out.println(exp.calculate(4,5));

        System.out.println(result);

    }
}
