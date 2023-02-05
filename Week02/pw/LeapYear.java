import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean trueorfalse = false;
        if (year % 400 == 0) {
            trueorfalse = true;
        } else if (year % 100 == 0) {
            trueorfalse = false;
        } else if (year % 4 == 0) {
            trueorfalse = true;
        }

        if (trueorfalse) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}
