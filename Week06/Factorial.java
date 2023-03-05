import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();

        BigInteger bg = new BigInteger("1");


        for(var i=1;i<=n;i++){
            bg=bg.multiply(new BigInteger(String.valueOf(i)));

        }

        System.out.println(bg.toString());


    }


}
