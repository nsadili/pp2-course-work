import java.util.Scanner;

public class Digits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        

        var n = sc.nextInt();
        var copyn = n;

        if (n < 0){
            n = -n;
        } // n = Math.abs(n)

        int digit; 
        var sum = 0;
        var product = 1;
        var cnt = 0;

        while(n > 0){

            digit = n % 10;

            sum += digit;
            product *= digit;
            cnt++;
             
            n /= 10;
        }
        var avg = copyn != 0 ? (double) sum / cnt : 0;

        product = copyn != 0 ? product : 0;

        System.out.printf(
            "Number = %d, Sum = %d, Product = %d, Average = %.3f\n", copyn, sum, product, avg
        );
    }
}
