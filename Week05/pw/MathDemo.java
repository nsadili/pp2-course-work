public class MathDemo {

    
    public static int min(int a,int b){
        return Integer.min(a, b);
    }

    public static int max(int a,int b){

        return a>b ? a : b;

    }

    public static int s(int[] args){
        var s=0;
        for(var i=0;i<args.length;i++)
        {
            s+=args[i];
        }

        return s;
    }

    public static float mean(int[] args){

        var s=s(args);

        float length=args.length;
        
        return s/length;

    }

    public static int factorial(int n){

        if(n>1) return n*factorial(--n);

        return 1;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(factorial(5));

        System.out.println(s(arr));

        System.out.println(mean(arr));


    }
}