import java.math.BigInteger;
import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        int a,n;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        n=sc.nextInt();

        System.out.println(power(a,n));


    }

    public static BigInteger power(int a, int n){

        BigInteger p= BigInteger.valueOf(a);

        for(int i=1;i<n;i++){

            p=p.multiply(BigInteger.valueOf(a));

        }

        return p;


    }
    
}