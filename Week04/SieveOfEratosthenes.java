import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 30; // Upper limit to find prime numbers
        boolean[] primes = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        primes[0] = false; // 0 is not prime
        primes[1] = false; // 1 is not prime

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }
}
