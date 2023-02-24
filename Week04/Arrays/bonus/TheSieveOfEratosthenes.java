package Week04.Arrays.bonus;
import java.util.Arrays;
import java.util.Scanner;
public class TheSieveOfEratosthenes {
    static int[] sieveV1(int n) {
        int[] primes = new int[n + 1];
        Arrays.fill(primes, 1);

        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 1) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = 0; 
                }
            }
        }

        return primes;
    }

    static boolean[] sieveV2(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = false; 
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[] isPrimes = sieveV2(n);
        System.out.printf("Prime numbers in range [%d,%d]:", 1, n);
        for (int i = 2; i < isPrimes.length; i++)
            if (isPrimes[i])
                System.out.print(" " + i);
        System.out.println();

        scan.close();
    }
}
