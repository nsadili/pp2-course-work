package pw;

public class MathDemo {
     // Method to return the minimum of two integers
     public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    // Method to return the maximum of two integers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    // Method to return the sum of an array of integers
    public int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
    // Method to return the mean of an array of integers
    public float mean(int[] args) {
        int sum = sum(args);
        float mean = (float) sum / args.length;
        return mean;
    }

    // Method to return the factorial of an integer
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
