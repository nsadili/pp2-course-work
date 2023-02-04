package week2_assignments;
//import java.util.Scanner;

public class Fact {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        //input.close();
        int n = Integer.parseInt(args[0]);
        
        if(n < 0) System.out.println("Please enter a positive number");
        else if(n == 0) System.out.println(1);
        else {
            int f = 1;
            int i;
            for(i = 1; i <= n; i++)
            {
               f *= i;
               if(i == n) continue;
               System.out.printf("%d * ", i);
            }
        System.out.printf("%d = %d", i, f);
        }
    }
}
