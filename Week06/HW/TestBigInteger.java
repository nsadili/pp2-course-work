import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger bigLongValue = maxLongValue.add(BigInteger.ONE); // value larger than Long.MAX_VALUE

        // factorial
        System.out.println("Factorial of " + bigLongValue + " is " + factorial(bigLongValue));

        // power
        BigInteger base = new BigInteger("123456789");
        int exponent = 20;
        System.out.println(base + " to the power of " + exponent + " is " + power(base, exponent));
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger power(BigInteger base, int exponent) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < exponent; i++) {
            result = result.multiply(base);
        }
        return result;
    }
}
