import java.util.*;
public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
         int x = scn.nextInt(); 
         int y = scn.nextInt();
        // int numberofdigits=0;
         for (int i=x; i<=y;i++){
           // while(i/10==0){numberofdigits++;}
            if(Math.pow((i%10),3)+Math.pow((i/10%10),3)+Math.pow((i/100),3)==i)System.out.print(""+i+" ");

         }
    }
}
