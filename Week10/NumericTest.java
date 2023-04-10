public class NumericTest {
    public static void main(String[] args) {
        Numeric<Float> num=new Numeric<>(25.25f);
        Numeric<Integer> num2=new Numeric<>(5);

        System.out.println(num.getValue());

        System.out.println(num.fractional());
        System.out.println(num.reciprocal());


        System.out.println(num.compareAbs(num2));
    }
}
