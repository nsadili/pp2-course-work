import java.util.Arrays;
import java.util.Scanner;

class SieveOfEratosthenes {

    static int[] sieveV1(int n) {
        int[] primes = new int[n + 1];
        Arrays.fill(primes, 1);

        for (int i = 2; i < primes.length; i++) {
            if (primes[i] == 1) {
                for (int j = i * 2; j < primes.length; j += i) {
                    primes[j] = 0; // these are not prime because divisible by i
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
                    primes[j] = false; // these are not prime because divisible by i
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // // find all the prime numbers that are less than or equal to the value of n
        // int[] primes = sieveV1(n);
        // // System.out.println(Arrays.toString(primes));

        // System.out.printf("Prime numbers in range [%d,%d]:", 1, n);
        // for (int i = 2; i < primes.length; i++)
        // if (primes[i] == 1)
        // System.out.print(" " + i);
        // System.out.println();

        // find all the prime numbers that are less than or equal to the value of n
        boolean[] isPrimes = sieveV2(n);
        // System.out.println(Arrays.toString(isPrimes));

        System.out.printf("Prime numbers in range [%d,%d]:", 1, n);
        for (int i = 2; i < isPrimes.length; i++)
            if (isPrimes[i])
                System.out.print(" " + i);
        System.out.println();

        scan.close();
    }
}