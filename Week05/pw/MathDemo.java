public class MathDemo {

    public static int min(int x,int y){

        return Integer.min(x, y);
    }

    public static int max(int x,int y){

        return x>y ? x : y;

    }

    public static int s(int[] args){
        var s=0;

        for(var i=0;i<args.length;i++){
            
            s+=args[i];
        }

        return s;
    }

    public static float mean(int[] args){

        var s=s(args);

        float length=args.length*1F;
        
        return s/length;

    }

    public static int factorial(int n){

        if(n>1) return n*factorial(--n);

        return 1;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        System.out.println(factorial( 5));

        System.out.println(s(arr));

        System.out.println(mean(arr));
    }
}