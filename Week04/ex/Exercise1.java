import java.util.*;

public class Exercise1{
    public static void main(String [] args){
        if(args.length==0){
            System.out.println("Please, enter an integer");
            System.exit(1);
        }
        int cnt=args.length;
        int a= sumArr(args);
         System.out.println(Arrays.toString(args));
        System.out.println("The sum of the numbers is " +sumArr(args));
        System.out.println("The average of the numbers is " +average(a,cnt));
    }
    
     private static int sumArr(String args[]){
        int sum=0;
        for (String token : args) 
          sum += Integer.valueOf(token);
          
          return sum;
     }

     private static float average(int a,int cnt){
      return  (float) a / cnt;
     
     }
    }
    
    