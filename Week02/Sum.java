import java.util.Scanner;

public class Sum {
   public static void main(String[]args){
    Scanner scn = new Scanner (System.in);
    System.out.println("Please add first number:");
    int x = scn.nextInt();
    System.out.println("Please add second number:");
    int y = scn.nextInt();
    System.out.println("The result is:" + (x+y));
    scn.close();
   }
} 


