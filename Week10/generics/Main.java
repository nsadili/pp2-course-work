package generics;
//import Numeric;
public class Main {
    public static void main(String[] args) {
        Numeric<Double> num = new Numeric<>(2.5);
        System.out.println(num.reciprocal());
        System.out.println(num.fraction());
    }
}
