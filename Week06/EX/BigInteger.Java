import java.math.BigInteger;

public class BigIntegerTest {
    
    public static void main(String[] args) {
        
        // Factorial
        int n = 100;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + factorial);
        
        // Power
        BigInteger base = BigInteger.valueOf(2);
        int exponent = 1000;
        BigInteger result = base.pow(exponent);
        System.out.println(base + "^" + exponent + " = " + result);
        
    }
}