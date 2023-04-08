public class NumericMain {
    public static void main(String[] args) {
        Numeric<Integer> num = new Numeric<>(10);
        Numeric<Double> num1 = new Numeric<>(-12.34);
        // System.out.println(num.reciprocal());
        // System.out.println(num.comparison(num1));
        // System.out.println(num1.fractional());
        System.out.println(num.checkAbs(87));
        
        System.out.println(num1.checkAbsolute(num1));
    }
}
