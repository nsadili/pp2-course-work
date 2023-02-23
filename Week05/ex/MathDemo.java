public class MathDemo {

    // we use static methods in there. When we pass two arguments to methods, we call Classname.method without creaing object. 
    // these methods do not depend on values in each object therefore no need to use them as instance method
    
    public static int min(int a,int b){
        return Integer.min(a, b);
    }

    public static int max(int a,int b){

        return a>b ? a : b;

    }

    public static int sum(int[] args){
        var sum=0;
        for(var i=0;i<args.length;i++)
        {
            sum+=args[i];
        }

        return sum;
    }

    public static float mean(int[] args){

        var sum=sum(args);

        float length=args.length*1F;
        
        return sum/length;

    }

    public static int factorial(int n){

        if(n>1) return n*factorial(--n);

        return 1;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(factorial(7));
        System.out.println(sum(arr));
        System.out.println(mean(arr));
    }
}
