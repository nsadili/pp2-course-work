package Week10.ex2;

public class Main {
    public static void main(String[] args) {
        Numeric<Integer> num = new Numeric<>(2);
        System.out.println(num.reciprocal());
        System.out.println(num.fractionalPart());
        System.out.println(num.isAbsEqualTo(-2.0f));
    }
}
