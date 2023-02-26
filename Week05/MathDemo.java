public class MathDemo {
    public static int Min(int a, int b) {
        return a < b ? a : b;
    }

    public int Min2(int a, int b) {
        return a < b ? a : b;
    }

    public int Max(int a, int b) {
        return a > b ? a : b;
    }
    public int Factorial(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac=(fac*i);
        }
        return fac;
    }
}
