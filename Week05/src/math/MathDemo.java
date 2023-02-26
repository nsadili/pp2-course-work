package math;

public class MathDemo {
    public int min(int a, int b) {
        if(a<b) return a;
        else return b;
    }
    public int max(int a, int b) {
        if(a>b) return a;
        else return b;
    }
    public int sum(int[] args) {
        int res = 0;
        for(int i: args) {
            res+=i;
        }
        return res;
    }
    public double mean(int [] args) {
        return sum(args)/args.length;
    }
    public int factorial(int n) {
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
}

// advantages of defining these methods as static are that we don't need to create an object from this class in order to use these methods