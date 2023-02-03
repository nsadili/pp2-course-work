package Easy;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();   
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year is a leap year!");
        }
        else {
            System.out.println("The year is not a leap year!");
        }
    }
   
}