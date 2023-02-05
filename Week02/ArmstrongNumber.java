import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
         int n= scn.nextInt();//for example lets think n and m is three digit numbers 
         int m= scn.nextInt();
        // int numberofdigits=0;
         for (int i=n; i<=m;i++){
           // while(i/10==0){numberofdigits++;}
            if(Math.pow((i%10),3)+Math.pow((i/10%10),3)+Math.pow((i/100),3)==i)System.out.print(""+i+" ");

         }
    }
}//for fingding digits in integer we need to convert integer to string 
