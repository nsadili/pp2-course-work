public class MathDemo {
public static int min(int a, int b)
{
   if ( a < b ) {
   return a;
   }
   else {
    return b ;
   }
   }

public static int max(int a, int b) 
{
    if ( b < a ) {
    return a ;
    }
    else {
   return b;
    }
}   
public static int sum(int[] args){
    int s=0; 
   for (int token: args)
     s += Integer.valueOf(token); 
     return s;

}

public  static float mean(Integer[] x){
    
    int s = sum(x) ;
    for (int i=0 ; i<x.length ; i++)
    {
        float y= sum(x) / x.length;
    }
      float y=1;
    return y;
}
private static int sum(Integer[] x) {
    return 0;
}

public static int factorial (int n) {
    int f = 1;
    for(int i=1; i<=n ; i++) 
    {
       f *= i;
    }
         return f ;

    
}
    public static void main(String[] args){
        Integer[] x = new Integer[args.length];
        for(int i=0 ; i<args.length ; i++)
        x[i] = Integer.valueOf(args[i]);


     System.out.println(min(23, 45));
     System.out.println(max(12, 34));
     System.out.println(sum(x));
     System.out.println(mean(x));
        System.out.println(factorial(7));
   
    }
}
