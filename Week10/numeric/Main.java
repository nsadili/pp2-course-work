package numeric;

public class Main {
    public static void main(String[] args) {
       Numeric<Double> num = new Numeric<>(0.1);
       Numeric<Integer> num2 = new Numeric<>(0);

       num.checkAbs(7);
       num.checkAbs(num2);
    }
}