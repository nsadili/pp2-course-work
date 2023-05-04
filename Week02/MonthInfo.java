import java.util.Scanner;

public class MonthInfo {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of the month: ");
            int monthNum = input.nextInt();

            String monthName;
            int numDays;

            switch(monthNum) {
                case 1:
                    monthName = "January";
                    numDays = 31;
                    break;
                case 2:
                    monthName = "February";
                    numDays = 28; // or 29 in a leap year
                    break;
                case 3:
                    monthName = "March";
                    numDays = 31;
                    break;
                case 4:
                    monthName = "April";
                    numDays = 30;
                    break;
                case 5:
                    monthName = "May";
                    numDays = 31;
                    break;
                case 6:
                    monthName = "June";
                    numDays = 30;
                    break;
                case 7:
                    monthName = "July";
                    numDays = 31;
                    break;
                case 8:
                    monthName = "August";
                    numDays = 31;
                    break;
                case 9:
                    monthName = "September";
                    numDays = 30;
                    break;
                case 10:
                    monthName = "October";
                    numDays = 31;
                    break;
                case 11:
                    monthName = "November";
                    numDays = 30;
                    break;
                case 12:
                    monthName = "December";
                    numDays = 31;
                    break;
                default:
                    monthName = "Invalid month";
                    numDays = 0;
                    break;
            }

            System.out.println(monthName + " has " + numDays + " days.");
        }
    }
}
