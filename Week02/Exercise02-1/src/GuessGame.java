import java.util.Scanner;
import java.lang.Math;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int cnt = 0, a = A;
        while (a > 0) {
            a /= 10; cnt++;
        }
        double r = Math.random();
        r = (int)(r * Math.pow(10, cnt));
        while (r > A) {
            r = Math.random();
            r = (int)(r * Math.pow(10, cnt));
        }

        cnt = 0;
        while (true) {
            int n = scan.nextInt();
            if (n == r) break;
            else {
                cnt++;
                if (n > r) System.out.println("LOWER");
                else System.out.println("HIGHER");
            }
        }
        System.out.println("You got the number right!");
        System.out.println("Your accuracy level is: " + 1.0 / cnt * 100 + "%");
    }
}
