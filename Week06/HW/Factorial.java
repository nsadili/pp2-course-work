import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int n = 50; 
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
