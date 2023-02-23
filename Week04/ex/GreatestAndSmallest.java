import java.util.*;
public class GreatestAndSmallest {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Please, enter an integer");
            System.exit(1);
        } 
        int[] a = new int[args.length];
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.valueOf(args[i]);
        }

        System.out.println("The maximum integer is " + Maximum(a));
        System.out.println("The minimum integer is " + Minimum(a));
    }

    private static int Maximum(int[] a){
        int mx= a[0];
        for(int i=1;i<a.length;i++)
            if(a[i]>mx) mx= a[i];     
     
      return mx;
}
     private static int Minimum(int[] a){
        int mn=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]<mn) mn=a[i];
        }
        return mn;
     }
}
