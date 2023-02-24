public class MathDemo {
    public static void main(String[] args) {
        int[] a = new int[args.length];
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.valueOf(args[i]);
        }
        System.out.println(min(4,6));
        System.out.println(max(4,6));
        System.out.println(sum(a));
        System.out.println(mean(a));
        System.out.println(factorial(5));
    }
    
    private static int min(int a, int b){
        if(a<b) return a;
        else return b;
    }
    private static int max(int a, int b){
        if(a<b) return b;
        else return a;
     }
    private static int sum(int[] args){
        int sum=0;
        for (int token : args) 
          sum += Integer.valueOf(token);
          
          return sum;
     
    }
    private static float mean(int[] args){
        int cnt= args.length;
        return  (float) sum(args) / cnt;
    }

    private static int factorial(int n){
     int a=1;
        for(int i=1; i<=n; i++){
            a*= i;
        }
       return a;
    }
}

