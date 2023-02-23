class MathDemo {

    public static int min(int a,int b) {
        if(a>b) return b;
        else return a;
    }

    public static int max(int a,int b) {
        if(a>b) return a;
        else return b;
    }

    public static int sum(int[] args) {
        int s=0;
        for(int i=0;i<args.length-1;i++) {
            s+=args[i];
        }

        return s;
    }

    public static float mean(int[] args) {
        return (float)sum(args)/args.length;
    }

    public static int factorial(int n) {
        if(n==0) return 1;
        else return factorial(n-1)*n;
    }
}