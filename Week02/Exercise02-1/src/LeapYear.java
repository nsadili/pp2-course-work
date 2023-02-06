import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            if (n % 4 == 0)
                if (n % 100 == 0)
                    if (n % 400 == 0) System.out.print("Leap year");
                    else System.out.print("Not a leap year");
                else System.out.print("Leap year");
            else System.out.print("Not a leap year");
    }
}
