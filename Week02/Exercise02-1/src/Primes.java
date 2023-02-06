import java.util.Scanner;
import java.lang.Math;

public class Primes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt = 1; break;
            }
        }

        if (cnt == 1) System.out.print("Not prime.");
        else System.out.print("Prime.");

    }
}
