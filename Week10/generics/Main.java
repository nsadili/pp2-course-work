package generics;

public class Main {
    public static void main(String[] args) {
        Numeric<Double> num = new Numeric<>(0.0);

        Numeric<Integer> num1 = new Numeric<>(2);

        System.out.println(num.checkAbs(num1));

        System.out.println(num.checkAbs(2));

    }
}
