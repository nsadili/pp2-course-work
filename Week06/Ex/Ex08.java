import java.math.BigInteger;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        
      
        System.out.println("For integers a and n calculate a^n: ");
        Scanner scn= new Scanner(System.in);
        int number= scn.nextInt();
        int power= scn.nextInt();
        BigInteger a = BigInteger.valueOf(number);
        BigInteger p=BigInteger.valueOf(power);
        BigInteger res1= a.pow(power);
        System.out.println(res1);

        System.out.println("Find the factorial of an integer n: "); 
        
        int f= scn.nextInt();
        BigInteger res= BigInteger.ONE;
        for(int i=1;i<=f;i++){
          res = res.multiply(BigInteger.valueOf(i));

        }
        System.out.println(res);
         
        
    }
}
