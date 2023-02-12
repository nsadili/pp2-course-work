//package Week03.datetime;

import java.util.Scanner;

public class CustomDateTest {
    
    public static void main(String[] args) {

        int month, day, year;
        int newMonth, newDay, newYear;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        month = scanner.nextInt();
        System.out.print("Enter day: ");
        day = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        //scanner.close();

        CustomDate customDate = new CustomDate(month, day, year);

        System.out.print("Date is set to: ");
        customDate.displayDate();
        System.out.println("Enter a new date to calculate the difference");
        System.out.print("Enter new month: ");
        newMonth = scanner.nextInt();
        System.out.print("Enter new day: ");
        newDay = scanner.nextInt();
        System.out.print("Enter new year: ");
        newYear = scanner.nextInt();
        scanner.close();

        CustomDate customDate2 = new CustomDate(newMonth, newDay, newYear);

        System.out.println("The difference is " + customDate.difference(customDate2) + " days");
        
        if (CustomDate.compare(customDate, customDate2) == 1) {
            System.out.println("First date is earlier than the second");
        } else if (CustomDate.compare(customDate, customDate2) == -1) {
            System.out.println("Second date is earlier than the first");
        } else {
            System.out.println("The dates are the same");
        }

        System.out.print("Date 1: ");
        customDate.displayFormatted();
        System.out.print("Date 2: ");
        customDate2.displayFormatted();
    }
}
