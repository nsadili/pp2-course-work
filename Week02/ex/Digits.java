import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var n = sc.nextInt();
        var copyN=n;

        n = Math.abs(n);
        int digit;
        int sum = 0, product = 1, count = 0;

        while (n > 0) {
            digit = n % 10;
            sum += digit;
            product *= digit;
            count++;
            n /= 10;
        }
        var avg=copyN!=0
        ?(double) sum / count
        :0;
        if(copyN==0)product=0;
        System.out.printf("Number=%d,sum=%d,Product=%d,Avg=%.3f\n",copyN,sum,product,avg);
    }
}
