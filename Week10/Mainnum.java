package Week10;
public class Mainnum {
    public static void main(String[] args) throws Exception {
        
        
    Numeric<Integer> num=new Numeric<>(23);
    Numeric<Integer> num2=new Numeric<>(25);
        System.out.println(num.getValue());
        System.out.println(num.reciprocal());
        System.out.println(num.fractional());

        num.compareAbs(2.3);
        num.compareAbs(num2.getValue().doubleValue());
    }
}
