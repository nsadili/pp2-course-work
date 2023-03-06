import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int m = scan.nextInt();
            BigInteger b = new BigInteger("1");
            for(int i = 1; i <= m; i++){
                b = b.multiply(new BigInteger(String.valueOf(i)));
            }
            System.out.println("Factorial of " + m + " is " + b);
        }
    }
}
