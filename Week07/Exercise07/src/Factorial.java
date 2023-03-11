public class Factorial {
    public static void main(String[] args) {
        int n = -3;

        try {
            System.out.println(findFactorial(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static long findFactorial(int a) {
        long fact = 1;
        if (a < 0)
            throw new IllegalArgumentException("Negative value not supported.");

        if (a == 0 || a == 1)
            return fact;

        for (int i = 2; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
