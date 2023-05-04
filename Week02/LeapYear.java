import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = input.nextInt();

            boolean isLeapYear = false;

            // If year is divisible by 4
            if (year % 4 == 0) {
                // If year is divisible by 100
                if (year % 100 == 0) {
                    // If year is divisible by 400
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                } else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}

