package EX;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex8_Integer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        BigInteger res = BigInteger.valueOf(1);
        
        for(long i=1;i<=(long)a;i++)
        res=res.multiply(BigInteger.valueOf(i));
        System.out.println(res);
    }
}
