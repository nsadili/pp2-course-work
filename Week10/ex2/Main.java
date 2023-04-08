package Week10.ex2;

public class Main {
    public static void main(String[] args) {
        Numberic<Double> num = new Numberic<>(0.0);
        Numberic<Float> num1 = new Numberic<>(124.25F);
        Numberic<Integer> num2 = new Numberic<>(5);
        System.out.println(num.getClass());
        try {
            System.out.println(num.reciprocal());
            System.out.println(num1.reciprocal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(num.fractional());
        System.out.println(num1.fractional());
        System.out.println(num.compareAbs(num2));
        num.compareAbs(2.5);
    }
}