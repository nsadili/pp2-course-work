package Week06.Ex;
import java.math.BigInteger;
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        int x,n;
        try (Scanner sc = new Scanner(System.in)) {
            x=sc.nextInt();
            n=sc.nextInt();
        }
        System.out.println(power(x,n));
    }

    public static BigInteger power(int x, int n){
        BigInteger p= BigInteger.valueOf(x);

        for(int i=1;i<n;i++) {
            p=p.multiply(BigInteger.valueOf(x));

        }
        return p;
    }
    
}
