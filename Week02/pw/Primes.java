import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2 || n % 2 == 0) {
            System.out.println(n + " is not a prime.");
            return;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime.");
                return;
            }
        }
        System.out.println(n + " is a prime.");
    }
}
