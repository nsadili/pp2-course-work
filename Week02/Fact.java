
import java.util.Scanner;

public class Fact {
    public static void main(String args[]) {
        Scanner scn = new Scanner (System.in);
        int num = scn.nextInt();
        if(num <0 ) {
            System.out.println("Enter a positive integer");
            System.exit(1);
        }
        
        long factorial = 1;
        for (int i = 1; i<=num; i++)
        {
            factorial *=i;

        }
        System.out.println(factorial);

}
   
}