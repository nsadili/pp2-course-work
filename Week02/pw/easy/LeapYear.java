
//package taghi_mammadov.week_02;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
            System.out.print("Input number of the Year: " );
            int year = input.nextInt();
            boolean LeapYear;
    
        LeapYear = (year % 4 == 0);
        LeapYear = LeapYear && (year % 100 != 0 || year % 400 == 0);
    
        if (LeapYear) {
          System.out.println(year + " is a leap year.");
        } else {
          System.out.println(year + " is not a leap year.");
        }
        }
        
        
    
    }
}

