import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int cpy = n;
        int cnt = 0;
        int sum = 0;
        int cpy1 = n;
       
        while(n != 0) {
            int digit = n % 10;
            cnt++;
            n /= 10;
        }

        while(cpy != 0) {
           int digit1 = cpy % 10;
            sum += digit1^cnt;
            cpy /= 10;

        }

        if (sum == cpy1)
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
