import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = obj.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                }
            } 
            else {
                    System.out.println(year + " is a leap year.");
            }
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
