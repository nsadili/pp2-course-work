public class Mathdemo {
    public int max (int a , int b){
        return Math.max(a,b);
    }

    public int min (int a , int b){
        return Math.min(a,b);
    }
    public int sum(int[] args){
        int res=0;
        for (int i=0; i< args.length; i++){
            res += args[i];
        }

        return res;

    }
    public float mean (int[] args)
    {
        if (args.length == 0){
            return 0;

        }
        int sum = sum(args);
        return (float) sum/ args.length;
    }
    public int factorial (int n)
    {
        if(n<0){
            System.out.println("n must be positive.");

        }
        int res = 1;
        for (int i=2; i<=n; i++){
            res*= i;
        }
        return res;
    }
}