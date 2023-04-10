package generics;

public class Main {
    public static void main(String[] args) {
        Numeric<Double> num = new Numeric<>(0.0);
        Numeric<Integer> num2 = new Numeric<>(0);

       // System.out.println(num.reciprocal());
       // System.out.println(num.fractional());

       num.checkAbs(5);
      // num.checkAbs("hello");
       num.checkAbs(num2);

       System.out.println(num.checkAbs(num2));
       System.out.println(num.checkAbs(0));
    }
}
