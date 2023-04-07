public class NumericTest {
    public static void main(String[] args) {
        Numeric<Integer> a = new Numeric<>(6);
        Numeric<Double> b = new Numeric<>(3.74);

        System.out.println(a.reciprocal()); 
        System.out.println(b.fractionalPart()); 
        System.out.println(a.absoluteValueEquals(b)); 
        System.out.println(new Numeric<Integer>(-6).absoluteValueEquals(new Numeric<Integer>(5))); 
        System.out.println(new Numeric<Integer>(-3).absoluteValueEquals(new Numeric<Integer>(3))); 

    }
}
