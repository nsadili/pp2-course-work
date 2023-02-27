package Week05.pw7;

public class MathDemo {
    /*Static will work better in this case. Because we do not have to create objects */
    public static int min(int a, int b){
        if (a > b) {
            return b;
        } 
        return a;
    }
    public static int max(int a, int b){
        if (a < b) {
            return b;
        } 
        return a;
    }
    public static int sum(int[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
    public static float mean(int[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return (float)sum / args.length;
    }
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
