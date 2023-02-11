import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        var n = scan.nextInt();
        var a=n;
        int digit;
        var sum=0;
        var product=1;
        var cnt=0;

        if(n<0) n=-n;

        while(n>0) {
            digit = n%10;
            sum+=digit;
            product*=digit;
            cnt++;
            n/=10;
        }

        var avg = a != 0
        ? (double) sum/cnt
        : 0;
        
        product = a != 0
        ? product
        : 0;
        System.out.printf("Number = %d, Sum = %d, Product = %d Avg=%.3f", a, sum, product, avg );
    }
}
