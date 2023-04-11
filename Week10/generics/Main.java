package week10.generics;

public class Main {
    public static void main(String[] args) {

        Numeric<Float> num = new Numeric<>(0F);
        Numeric<Integer> num2 = new Numeric<>(5);
        System.out.println(num.getValue());
        System.out.println(num.reciprocal());
        System.out.println(num.fractional());

        num.compareAbs(2.5);
        //num.compareAbs(num2);
    }
}
