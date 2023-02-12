import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please indicate the year: ");
        int x = scn.nextInt();
        if((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0))
            System.out.println(x + " is a leap year.");
        else
            System.out.println(x + " is not a leap year.");
            scn.close();
    }
}