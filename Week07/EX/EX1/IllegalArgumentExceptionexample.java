package EX1;

public class IllegalArgumentExceptionexample {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}