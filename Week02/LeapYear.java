import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) 

       { 
        Scanner scn = new Scanner(System.in);

        int year = scn.nextInt();
        
       

        if (year % 4 == 0) 

        System.out.println("Yes, it is a leap year");

        

        if (year % 4 != 0)
        
        System.out.println("No, it is not a leap year");}
}
