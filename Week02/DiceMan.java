import java.util.*;
       
public class DiceMan {
     public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
             int x= scn.nextInt();
            int num1 = (int) (Math.random() * 6)+1;
			int	num2 = (int) (Math.random() * 6)+1;
            int sum = num1+num2;
            if(x==sum)System.out.println("Player wins");
            if(x!=sum & x<=12 & x>=2)  System.out.println("Computer wins");
            
            if (x>12 | x<2) System.out.println("Error");
if (x==0) System.exit(0);
}
} 