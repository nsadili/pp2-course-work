import java.math.BigInteger;

public class Power {
    public static void main(String[] args) {
        BigInteger base = new BigInteger("123456789");
        int exponent = 10;
        BigInteger result = base.pow(exponent);
        System.out.println(result);
    }
}
