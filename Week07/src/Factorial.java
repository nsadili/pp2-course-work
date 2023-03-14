import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        while (sc.hasNextInt()) {
            n = sc.nextLong();
            try {
                System.out.printf("%d! is %d\n", n, factorial(n));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static long factorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input is negative");
        }

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 1;
        }
        
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
