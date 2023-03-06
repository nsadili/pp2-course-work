package ex_8;
import java.math.BigInteger;

public class Power {
    public static void main(String[] args) {
        int a = 5;
        int n = 20;

        BigInteger res = new BigInteger(String.format("%d", a));
        BigInteger num = new BigInteger(String.format("%d", a));
        
        for (int i = 0; i < n - 1; i++) {
            res = res.multiply(num);
        }

        System.out.println(res);
    }
}
