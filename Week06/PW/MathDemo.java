public class MathDemo {
    public static int Min(int x,int y) {
        if(x > y) {
            return y;
        }
        else {
            return y;
        }
    }
    public static int Max(int x,int y) {
        if(x < y) {
            return y;
        }
        else {
            return x;
        }
    }
    public static int Sum(int[] args) {
        int res = 0;
        for(int i = 0 ; i < args.length; i++) {
            res += args[i];
        }
        return ans;
    }
    public static float MeanVal(int[] args) {
        return (float)(Sum(args)) / args.length;
    }
    public static int Fact(int n) {
        if(n==0) return 1;
        if(n==1) return 1;      
        return n * Fact(n);
    }
}
