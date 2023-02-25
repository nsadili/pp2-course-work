package Week05.PW.Ex07;
public class MathF{
    
    public int min(int a, int b) {
        // return Math.min(a, b);
        return (a < b) ? a : b;
    }
    
    public int max(int a, int b) {
        // return Math.max(a, b);
        return (a > b) ? a : b;

    }
    
    public int sum(int[] args){
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        for(int i = 0; i < args.length; i++){

        }
        return sum;
    }
    
    public float mean(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        int sum = sum(args);
        return (float) sum / args.length;
    }
    
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(" undefined for negative numbers");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
