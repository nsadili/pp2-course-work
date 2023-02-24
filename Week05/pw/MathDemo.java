public class MathDemo {
    public static void main(String[] args){
        int a=5;
        int b=6;
        int[] arg = {1,2,4,7};
        System.out.println("ad");
        System.out.printf("min:%d\nmax:%d\nsum:%d\nmean:%f\nfac:%d\n",MathDemoClass.min(a, b),MathDemoClass.max(a, b),MathDemoClass.sum(arg),MathDemoClass.mean(arg),MathDemoClass.factorial(b));
    }
}

class MathDemoClass{
    static int min(int a, int b){
        return a>=b ? b : a;
    }

    static int max(int a, int b){
        return a>=b ? a : b;
    }

    static int sum(int[] args){
        int sum=0;
        for(int a: args)
        sum+=a;
        return sum;
    }

    static float mean(int[] args){
        int sum=0;
        for(int a: args)
        sum+=a;
        return sum/args.length;
    }

    static int factorial(int n){
        int fac=1;
        while(n>1){
            fac*=n;
            n--;
        }
        return fac;
    }
}
