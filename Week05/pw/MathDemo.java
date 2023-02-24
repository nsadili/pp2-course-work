package Week05.pw;

public class MathDemo {
    
    public int min(int a, int b) {
        return Math.min(a, b);
    }
    
    public int max(int a, int b) {
        return Math.max(a, b);
    }
    
    public int sum(int[] args) {
        int sum = 0;
        for (int num : args) {
            sum += num;
        }
        return sum;
    }
    
    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
    
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
