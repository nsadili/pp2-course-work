import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long year = sc.nextLong();
        int LeapYear;
        if ((year % 400 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 != 0)) {
            LeapYear = 1;
        } else {
            LeapYear = 0;
        }
        if (LeapYear == 1) {
            System.out.println("leap year");
        } else if (LeapYear == 0) {
            System.out.println("not a leap year");
        }
    }
}
