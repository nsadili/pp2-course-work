import java.util.Scanner;
import java.math.BigInteger;
public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number and its power :");
        int num = scan.nextInt();
        int pow = scan.nextInt();
        System.out.println(powerOf(num, pow).toString());
    }

    public static  BigInteger powerOf(int num, int pow){
        BigInteger res = BigInteger.valueOf(num);
        for(int i = 1; i < pow; i++){
            res = res.multiply(BigInteger.valueOf(num));
        }

        return res;
    }
}
