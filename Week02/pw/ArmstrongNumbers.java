import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int cpy = n;
        int cnt = 0;
        int sum = 0;
        int cpy1 = n;
        int digit2 = 1;

        while(n != 0) {
            int digit = n % 10;
            cnt++;
            n /= 10;
        }

        while(cpy != 0) {
          
           for (int i = 0; i < cnt; i++) { 
            int digit1 = cpy % 10;

            for (int j = 0; j < cnt; j++) { 
            digit2 *= digit1; 
            }

            sum += digit2;
            digit2 = 1;
            cpy /= 10;
           }

        }

        if (sum == cpy1)
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
