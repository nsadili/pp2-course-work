import generics.Numeric;

public class TestNumeric {
    public static void main(String[] args) {

        Numeric<Float> num = new Numeric<>(2.500f);
        Numeric<Integer> num2 = new Numeric<>(2);

        /*System.out.println(num.getValue());

        System.out.println(num.reciprocal());
        System.out.println(num.fractional());*/

       System.out.println(num2.compareAbs(2.0));
       System.out.println(num.compareAbs(num2));


    }
}
