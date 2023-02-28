
public class Mathdemo {
     public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int sum(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            result += args[i];
        }
        return result;
    }
    public float mean(int[] args) {
        int sum = sum(args);
        float mean = (float) sum / args.length;
        return mean;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}