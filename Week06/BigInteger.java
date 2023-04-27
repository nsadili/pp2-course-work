import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
        
        // Factorial example
        int n = 50;
        BigInteger factorial = BigInteger.valueOf(1);
        
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(n + "! = " + factorial);
        
        
        // Power example
        BigInteger base = new BigInteger("12345678901234567890");
        int exponent = 10;
        BigInteger power = base.pow(exponent);
        
        System.out.println(base + "^" + exponent + " = " + power);
    }
}

