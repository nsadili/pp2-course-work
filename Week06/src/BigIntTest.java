import java.math.BigInteger;
import java.util.Scanner;
public class BigIntTest {
    static BigInteger bigFactorial(BigInteger a) {
        if (a.compareTo(BigInteger.ONE) == 0) {
            return BigInteger.ONE;
        } else {
            return a.multiply(bigFactorial(a.subtract(BigInteger.ONE)));
        }
    }
    static BigInteger bigPower(BigInteger a, int pow) {
        BigInteger res = new BigInteger("1");
        for(int i=0; i<pow ; i++) {
            res = res.multiply(a);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BigInteger a = scn.nextBigInteger();
        System.out.println(bigFactorial(a));
        scn.close();
        
        BigInteger b = new BigInteger("1387982749873439847291");
        System.out.println(bigPower(b, 10));

    }
}

// with bigint i found factorial of 1000