import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var year = scan.nextInt();
        if (year % 400 == 0)
            System.out.println("It is a leap year.");
        else
            System.out.println("It is not a leap year.");
    }
}
