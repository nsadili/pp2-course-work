package Week06;
import java.math.BigInteger;
public class Factorial {

    public static void main(String[] args) {
        int n = 100; 

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
}
public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 1000;

        BigInteger result = BigInteger.valueOf(base).pow(exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
}
