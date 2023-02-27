public class MathDemo {
    public int min(int a, int b) {
        return Math.min(a, b);
    }
    
    public int max(int a, int b) {
        return Math.max(a, b);
    }
    
    public int sum(int[] args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
    
    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        return (float) sum(args) / args.length;
    }
    
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
