import java.util.*;
public class GreatestAndSmallest {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("Please, enter an integer");
            System.exit(1);
        }
        System.out.println("The maximum integer is " + Maximum());
        System.out.println("The minimum integer is " + Minimum());
        
    }   

     int num=new int[args];

    private static int Maximum(int[] args){
        int mx= args[0];
        for(int i=-1;i>=0;i--){
            if(args[i]>mx) mx= args[i];     
     }
      return mx;
}
     private static int Minimum(int[] args){
        int mn=args[0];
        for(int i=0; i>=0; i--){
            if(args[i]<mn) mn=args[i];
        }
        return mn;
     }
}
