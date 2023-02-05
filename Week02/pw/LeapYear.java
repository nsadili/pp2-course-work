import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter year  -->");

        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)

        {

            System.out.println(year + ": leap year");

        }

        else {
            System.out.println(year + ":not a leap year");
        }

    }

}

