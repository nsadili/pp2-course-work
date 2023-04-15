public class Main {
    public static void main(String[] args) {

        Calculator sum = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;
        Calculator exp = (a, b) -> Math.pow(a, b);

        System.out.println(sum.calculate(7, 9));
        System.out.println(sub.calculate(7, 9));
        System.out.println(mul.calculate(7, 9));
        System.out.println(div.calculate(7, 9));
        System.out.println(exp.calculate(7, 9));

    }
}