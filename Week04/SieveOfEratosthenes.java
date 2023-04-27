public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        boolean[] primes = new boolean[n + 1];

        // Initialize all elements to true
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        // Loop through array and set multiples of each prime to false
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        // Print out prime numbers
        System.out.print("Prime numbers: ");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

