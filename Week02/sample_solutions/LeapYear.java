/**
 * Leap year has 366 days instead of 365, by extending February to 29 days
 * rather than the common 28. <br />
 * These extra days occur in each year which is an integer multiple of 4 (except
 * for years evenly divisible by 100, but not by 400).
 * 
 * To compile: javac -d ./classes .\LeapYear.java <br />
 * To execute: java -cp .\classes\ LeapYear {value for year} <br />
 * 
 * @author Nuraddin Sh. Sadili
 */

public class LeapYear {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("year is not entered.");
            System.exit(0);
        }

        int year = Integer.parseInt(args[0]);
        // int year = Integer.valueOf(args[0]);

        if (year % 4 != 0)
            System.out.println("Not a leap year");
        else {
            if (year % 100 != 0)
                System.out.println("A leap year");
            else if (year % 400 == 0)
                System.out.println("A leap year");
            else
                System.out.println("Not a leap year");
        }

        // if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
        // System.out.println("Not a leap year");
        // else
        // System.out.println("A leap year");

    }
}
