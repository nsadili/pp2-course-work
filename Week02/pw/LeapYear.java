import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean leap_year = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap_year = true;
                }
            } else
            {
                leap_year = true;
            }
        }

        if (leap_year) {
            System.out.println("it is");
        } else
        {
            System.out.println("it is not");
        }
    }
}