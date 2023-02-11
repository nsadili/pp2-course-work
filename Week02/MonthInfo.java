package Week02;
import java.util.Scanner;

public class MonthInfo {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number of the month :  ");
        int mon = in.nextInt();

        int days = 0;
        String monthname = "";
        if (mon < 1 || mon > 12){
            System.out.println("Not correct month number !!!");
        }
        switch (mon){
            case 1:
                monthname = "January";
                days = 31;
                break;
            case 2:
                monthname = "February";
                days = 28;
                break;
            case 3:
                monthname = "March";
                days = 31;
                break;
            case 4:
                monthname = "April";
                days = 30;
                break;
            case 5:
                monthname = "May";
                days = 31;
                break;
            case 6:
                monthname = "June";
                days = 30;
                break;
            case 7:
                monthname = "July";
                days = 31;
                break;
            case 8:
                monthname = "August";
                days = 31;
                break;
            case 9:
                monthname = "September";
                days = 30;
                break;
            case 10:
                monthname = "October";
                days = 31;
                break;
            case 11:
                monthname = "November";
                days = 30;
                break;
            case 12:
                monthname = "December";
                days = 31;
                break;
        }
        System.out.println(monthname + " has " + days + " days:)");
    }
}

