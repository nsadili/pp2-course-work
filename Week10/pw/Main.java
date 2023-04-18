package Week.pw;
import pw.GenericPairClass;

public class Main {
    public static void main(String[] args){

        Numeric<Integer> num = new Numeric<>(123);

        System.out.println(num.getValue());
        System.out.println(num.recipricol());
        System.out.println(num.fractional());

    }
    
}
