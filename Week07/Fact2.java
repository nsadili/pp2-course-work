import java.util.*;
public class Fact2 {
    public static void main(String[] args){
    //if(args.length < 1){
      //  System.out.println("Please, provide some input");
        //System.exit(1);
    //}
   // int n=Integer.parseInt(args[0]);
   Scanner scan = new Scanner(System.in);
   int n=scan.nextInt();
   scan.close();
   int f=factorial(n);
   System.out.printf("%d! = %lld\n", n, f);
   
}
public static int factorial(int n){
    int f=1;
    if(n>=0)
    for(int c=1; c<=n;c++)
    f*=c;
    //else throw new IllegalArgumentException("The number must be greater than 0");  
    return f;
}
}