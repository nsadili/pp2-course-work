package ex3;

public class Main {
    public static void main(String[] args) {

        Calculator add= (a,b) -> a+b;
        Calculator sub= (a,b) -> a-b;
        Calculator mult= (a,b) -> a*b;
        Calculator div=(a,b) -> {
            if(b==0) throw new IllegalArgumentException();
            return a/b;
        };
        Calculator exp=(a,b) -> Math.pow(a, b);


        System.out.println(add.calculate(5, 2));
        System.out.println(sub.calculate(5, 2));
        System.out.println(mult.calculate(5, 2));
        System.out.println(div.calculate(5, 2));
        System.out.println(exp.calculate(5, 2));

    }
}
