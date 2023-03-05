package Week5CodesByTA;

public class MathDemo {
    public static int min(int a,int b) {
        if(a > b) {
            return b;
        }
        else {
            return a;
        }
    }
    public static int max(int a,int b) {
        if(a < b) {
            return b;
        }
        else {
            return a;
        }
    }
    public static int sum(int[] args) {
        int ans = 0;
        for(int i = 0 ; i < args.length; i++) {
            ans += args[i];
        }
        return ans;
    }
    public static float mean(int[] args) {
        return (float)(sum(args)) / args.length;
    }
    public static int factorial(int n) {
        int ans = 1;
        for(int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
