package Week04.Array;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100; // find primes up to 100
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // initialize all elements to true
        
        // loop through array and set non-prime elements to false
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // print out the prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
