package Week05.pw;

public class MathDemo {

    public static int min ( int a, int b){
        if (a<b) return a;
        else return b;
    }
    public static int max ( int a, int b){
        if (a>b) return a;
        else return b;
    }
    public static int sum ( int[] args) {
        int sum = 0;
        for (int n : args) {
            sum += n;
        }
        return sum;
    }
    public static float mean ( int[] args){
        int sum=0, mean=0;
        for (int n:args){sum+=n;}
        mean=sum/args.length;
        return mean;
    }
    public static int factorial ( int n){
        int fac=1;
        for(int i=1; i<=n; i++) {
            fac+=i;
        }
        return fac;
    }
}