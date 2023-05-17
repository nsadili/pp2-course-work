import java.util.*;
public class armstrongnum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
         int a = scn.nextInt();
         int b = scn.nextInt();
         for (int i=a; i<=b;i++){
            if(Math.pow((i%10),3)+Math.pow((i/10%10),3)+Math.pow((i/100),3)==i)
            System.out.print(""+i+" ");

         }
    }
}