public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 100;
        boolean[] primes = new boolean[n + 1];

        for (int i = 4; i <= n; i += 2) {
            primes[i] = false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
