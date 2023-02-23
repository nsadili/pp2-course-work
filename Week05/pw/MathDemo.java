public class MathDemo {
    
    public int min(int a, int b) {
        return Math.min(a, b);
    }
    
    public int max(int a, int b) {
        return Math.max(a, b);
    }
    
    public int sum(int[] args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
    
    public float mean(int[] args) {
        int sum = sum(args);
        return (float) sum / args.length;
    }
    
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
