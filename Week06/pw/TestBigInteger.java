import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("83161427638172973489237937");
        System.out.println(num1);
        BigInteger num2 = BigInteger.valueOf(4718927324839748L);
        if (num1.compareTo(num2) > 0) {
            System.out.println("num1 is greater");
        } else (num1.compareTo(num2) < 0) {
            System.out.println("num1 is less");
        } 
    }
}
